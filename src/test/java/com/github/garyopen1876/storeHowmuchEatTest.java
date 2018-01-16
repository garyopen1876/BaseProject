package com.github.garyopen1876;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class storeHowmuchEatTest extends TestCase {
    public void test_1() {
        storeHowmuchEat sH = new storeHowmuchEat();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "1";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sH.storeHowmuchEat(testArray));
        } catch (Exception e) {
            System.out.println("success");
        }

    }

    public void test_2() {
        storeHowmuchEat sH = new storeHowmuchEat();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);

        String data = "2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(testArray, sH.storeHowmuchEat(testArray));

    }

    public void test_3() {
        storeHowmuchEat sH = new storeHowmuchEat();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐", "媽媽的味道", "我家", 0, 5.0);
        testArray.add(store1);
        try {
            String data = "8";
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            assertEquals(testArray, sH.storeHowmuchEat(testArray));
        } catch (Exception e) {
            System.out.println("success使用者亂輸入");
        }

    }

    public void test_4() {
        storeHowmuchEat sH = new storeHowmuchEat();
        ArrayList<storeData> testArray = new ArrayList<storeData>();
        assertEquals(testArray,  sH.storeHowmuchEat(testArray));
        System.out.println("店家被刪光光了");

    }
}
