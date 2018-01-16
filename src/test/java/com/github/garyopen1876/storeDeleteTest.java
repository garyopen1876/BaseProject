package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeDeleteTest extends TestCase {
    public void test_1() {
        storeDelete sD = new storeDelete();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "媽媽餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sD.deletStore(testArray));
        } catch (Exception e) {
            System.out.println("success刪除所有店家");
        }
    }

    public void test_2() {
        storeDelete sD = new storeDelete();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        storeData store2 = new storeData("爸爸餐", "爸爸的味道", "我家", 0, 5.0);
        testArray.add(store1);
        testArray.add(store2);
        try {
            String data = "爸爸餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sD.deletStore(testArray));
        } catch (Exception e) {
            System.out.println("success刪除爸爸餐");
        }
    }

    public void test_3() {
        storeDelete sD = new storeDelete();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);

        String data = "back";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray, sD.deletStore(testArray));
        System.out.println("success取消刪除");

    }

    public void test_4() {
        storeDelete sD = new storeDelete();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "姊姊餐";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sD.deletStore(testArray));
        } catch (Exception e) {
            System.out.println("success使用者輸入不再列表的店家");
        }
    }

    public void test_5() {
        storeDelete sD = new storeDelete();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        assertEquals(testArray, sD.deletStore(testArray));
        System.out.println("店家被刪光光了");

    }

}
