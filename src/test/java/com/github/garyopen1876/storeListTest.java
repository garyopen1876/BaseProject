package com.github.garyopen1876;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.junit.Assert.*;

public class storeListTest extends TestCase{

    @Test
    public void test_1(){
        storeList sL=new storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

    }

}
