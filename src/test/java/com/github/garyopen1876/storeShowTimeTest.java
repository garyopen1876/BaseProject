package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeShowTimeTest extends TestCase {

    public void test_1(){
        storeShowTime sS=new storeShowTime();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "媽媽餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sS.storeShowTime(testArray));
        }catch (Exception e){
            System.out.println("success列出時間");
        }
    }
    public void test_2(){
        storeShowTime sS=new storeShowTime();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

        String data= "back";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray, sS.storeShowTime(testArray));

    }
    public void test_3(){
        storeShowTime sS=new storeShowTime();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "爸爸餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sS.storeShowTime(testArray));
        }catch (Exception e){
            System.out.println("success使用者輸入不在列表內的店家");
        }
    }
    public void test_4() {
        storeShowTime sS=new storeShowTime();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        assertEquals(testArray,  sS.storeShowTime(testArray));
        System.out.println("店家被刪光光了");
        }

}
