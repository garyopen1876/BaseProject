package com.github.garyopen1876;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class storeIntroductionTest extends TestCase {

    @Test
    public void introductionShow() {
    }
    public void test_1(){
        storeIntroductionTest sI=new storeIntroductionTest();
        storeList sL=new storeList();
        ArrayList<storeData> testArray=new ArrayList<storeData>();
        storeData store1 = new storeData("媽媽餐","媽媽的味道", "我家",0,5.0);
        testArray.add(store1);

        String data= "3";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        
    }
}
