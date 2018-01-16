package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeRandomTest extends TestCase{
    public void test_1(){
        storeRandom sR=new  storeRandom();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "1";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sR.storeRandom(testArray));
        }catch (Exception e){
            System.out.println("success");
        }
    }
    public void test_2(){
        storeRandom sR=new  storeRandom();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

        String data= "2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray, sR.storeRandom(testArray));

    }
    public void test_3() {
        storeRandom sR = new storeRandom();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "5";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sR.storeRandom(testArray));
        } catch (Exception e) {
            System.out.println("success使用者亂輸入");
        }
    }
}
