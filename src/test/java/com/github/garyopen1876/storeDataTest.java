package com.github.garyopen1876;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * storeData Tester.
 *
 * @author <Authors name>
 * @since <pre>�@�� 16, 2018</pre>
 * @version 1.0
 */

public class storeDataTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getName()
     *
     */
    @Test
    public void testGetName() throws Exception {
//TODO: Test goes here...
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals("麥當勞",store1.getName());
    }

    /**
     *
     * Method: setName(String name)
     *
     */
    @Test
    public void testSetName() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getIntroduction()
     *
     */
    @Test
    public void testGetIntroduction() throws Exception {
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals("著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間",store1.getIntroduction());
//TODO: Test goes here...
    }

    /**
     *
     * Method: getWhereStore()
     *
     */
    @Test
    public void testGetWhereStore() throws Exception {
//TODO: Test goes here...
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals("407台中市西屯區福星路427號",store1.getWhereStore());
    }

    /**
     *
     * Method: getMoney()
     *
     */
    @Test
    public void testGetMoney() throws Exception {
//TODO: Test goes here...
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals(100,store1.getMoney());
    }

    /**
     *
     * Method: getStar()
     *
     */
    @Test
    public void testGetStar() throws Exception {
//TODO: Test goes here...
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals(4.0,store1.getStar());
    }

    /**
     *
     * Method: setStar(double star)
     *
     */
    @Test
    public void testSetStar() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getStarPeople()
     *
     */
    @Test
    public void testGetStarPeople() throws Exception {
//TODO: Test goes here...
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        assertEquals(1,store1.getStarPeople());
    }

    /**
     *
     * Method: setStarPeople()
     *
     */
    @Test
    public void testSetStarPeople() throws Exception {
//TODO: Test goes here...
    }


}
