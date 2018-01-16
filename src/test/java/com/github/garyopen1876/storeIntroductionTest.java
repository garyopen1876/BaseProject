package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeIntroductionTest extends TestCase{
    public void test_1(){
        storeIntroduction sI=new  storeIntroduction();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "媽媽餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sI.IntroductionShow(testArray));
        }catch (Exception e){
            System.out.println("success");
        }
    }
    public void test_2(){
        storeIntroduction sI=new  storeIntroduction();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

        String data= "back";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray,sI.IntroductionShow(testArray));

    }
    public void test_3() {
        storeIntroduction sI=new  storeIntroduction();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "爸爸餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sI.IntroductionShow(testArray));
        } catch (Exception e) {
            System.out.println("success使用者輸入不再列表內的店家");
        }
    }

    public void test_4() {
        storeIntroduction sI=new  storeIntroduction();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        assertEquals(testArray,  sI.IntroductionShow(testArray));
        System.out.println("店家被刪光光了");

    }

}
