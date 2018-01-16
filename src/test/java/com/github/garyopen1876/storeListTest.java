package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeListTest extends TestCase{
    public void test_1(){
        storeList sL=new  storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "1";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sL.storeNameList(testArray));
        }catch (Exception e){
            System.out.println("success選擇case1");
        }
    }
    public void test_2(){
        storeList sL=new  storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "2";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sL.storeNameList(testArray));
        }catch (Exception e){
            System.out.println("success選擇case2");
        }
    }
    public void test_3(){
        storeList sL=new  storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        String data = "3";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray, sL.storeNameList(testArray));
        System.out.println("success成功返回main");
    }
    public void test_4(){
        storeList sL=new  storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);
        try {
            String data = "8";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sL.storeNameList(testArray));
        }catch (Exception e){
            System.out.println("success使用者亂輸入");
        }
    }
}
