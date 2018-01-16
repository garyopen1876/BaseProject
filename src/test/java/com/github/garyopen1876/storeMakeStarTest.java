package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeMakeStarTest extends TestCase{
    public void test_1(){
        storeMakeStar sM=new  storeMakeStar();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

            String data = "15";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sM.storeMakeStar(testArray,0));

            System.out.println("success使用者亂輸入");
    }
    public void test_2(){
        storeMakeStar sM=new  storeMakeStar();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
            String data = "1";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sM.storeMakeStar(testArray,0));

            System.out.println("success更改評價");

    }

}
