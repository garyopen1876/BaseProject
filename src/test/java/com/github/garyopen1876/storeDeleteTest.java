package com.github.garyopen1876;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
* storeDelete Tester.
*
* @author <Authors name>
* @since <pre>�@�� 16, 2018</pre>
* @version 1.0
*/
public class storeDeleteTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}

/**
*
* Method: deletStore()
*
*/
@Test
public void testDeletStore() throws Exception {
//TODO: Test goes here...
    /*店家資料*/
    storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
    storeData store2 = new storeData("台北江記麻辣臭豆腐","湯頭很濃鬱，豆腐滷的很入味 ，適合冬天品嚐", "407台中市西屯區文華路105之10號",110,3.6);
    storeData store3 = new storeData("小辣椒","便宜大碗，學生吃飽的好選擇", "407台中市西屯區文華路109號",70,3.8);
    storeData store4 = new storeData("陽光老爹","簡餐、小火鍋、冰品，冷熱通吃", "407台中市西屯區文華路121號",65,2.8);
    storeData store5 = new storeData("大丁日式豚骨拉麵","位置多，出餐快，餐點種類眾多，價位實惠，涼麵好吃", "407臺中市西屯區台中市西屯區文華路121之31號",60,3.7);
    storeData store6 = new storeData("學甲人車輪餅","用料飽滿高cp小小一顆吃起來很過癮", "407台中市西屯區文華路203之2號",10,4.5);
    storeData store7 = new storeData("御方香早餐","價格不貴 飲料15元喝到飽", "407台中市西屯區西安街277巷25弄1號",35,4.2);
    storeData store8 = new storeData("嗚啦啦","音樂環繞效果不錯，燈光氣氛裝潢良好", "407台中市西屯區文華路179號",90,3.6);
    storeData store9 = new storeData("摩斯漢堡","有光缐明亮的二樓用餐區及戶外區，有逢甲大學的學生證折扣優惠九折！適合用餐及看書！", "407台中市西屯區文華路100號",110,3.9);
    storeData store10 = new storeData("大甲胡媽媽","便宜又好吃", "407台中市西屯區文華路177號",35,4.1);
    storeData store11 = new storeData("吉野烤肉飯","配菜雖然一般， 但烤肉很好吃，分量也很多 ", "407臺中市西屯區台中市西屯區文華路127巷7號",80,4.1);
    storeData store12 = new storeData("九州日式豚骨拉麵","白湯拉麵非常入味，價格也很親民", "407台中市西屯區逢甲路20巷26-2號",75,3.7);
    storeData store13 = new storeData("麻而辣臭豆腐","鴨肉飯必吃，吃不夠還可以多叫鴨油飯", "407台中市西屯區文華路121之10號",60,4.3);
    storeData store14 = new storeData("九湯屋日本拉麵","正常量可能吃不飽，但加麵後份量十足，服務很好", "407台中市西屯區文華路175號",99,4.4);
    storeData store15 = new storeData("正宗印度咖哩飯店","印尼炒泡麵便宜又好吃，還能加大!!!", "407台中市西屯區文華路139巷19弄19-4號",55,4.0);
    storeData store16 = new storeData("向上水餃","便宜好吃的水餃店，酸辣湯、水餃都很好吃", "407台中市西屯區福星路295號",40,3.9);
    storeData store17 = new storeData("明倫蛋餅","現點現做，整體吃起來鬆軟微甜，帶著濃濃蛋香", "407台中市西屯區福星路546號",45,3.7);
    storeData store18 = new storeData("赤鬼炙燒牛排","雖然是平價牛排，但肉質軟嫩入味，濃湯也好喝，出餐稍慢", "407台中市西屯區文華路11號",120,4.0);
    storeData store19 = new storeData("擄胃專家","好吃，份量十足，烤肉調味夠味，肉片不厚", "407台中市西屯區文華路127巷22號",75,4.4);
    storeData store20 = new storeData("米果","關東煮料多又便宜，炸物也非常好吃", "407台中市西屯區逢甲路20巷28弄4號",70,4.2);
    ArrayList<storeData> testArr=new ArrayList<storeData>();
    /*加入店家資料*/
    testArr.add(store1);
    testArr.add(store2);
    testArr.add(store3);
    testArr.add(store4);
    testArr.add(store5);
    testArr.add(store6);
    testArr.add(store7);
    testArr.add(store8);
    testArr.add(store9);
    testArr.add(store10);
    testArr.add(store11);
    testArr.add(store12);
    testArr.add(store13);
    testArr.add(store14);
    testArr.add(store15);
    testArr.add(store16);
    testArr.add(store17);
    testArr.add(store18);
    testArr.add(store19);
    testArr.add(store20);
    /*加入店家資料*/
    assertEquals(testArr,new storeDelete(testArr).deletStore(true));
}


/**
*
* Method: choose()
*
*/
@Test
public void testChoose() throws Exception {
//TODO: Test goes here...
    storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
    ArrayList<storeData> testArr=new ArrayList<storeData>();
    ArrayList<storeData> testArr1=new ArrayList<storeData>();
    testArr.add(store1);
    TestCase.assertEquals("麥當勞",new storeDelete(testArr).choose(true));
    TestCase.assertEquals("back",new storeDelete(testArr1).choose(true));
/*
try {
   Method method = storeDelete.getClass().getMethod("choose");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: deletstore(String deleteWhichStore)
*
*/
@Test
public void testDeletstore() throws Exception {
//TODO: Test goes here...
    storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
    ArrayList<storeData> testArr=new ArrayList<storeData>();
    testArr.add(store1);
    TestCase.assertEquals(1,new storeDelete(testArr).deletstore("麥當勞"));
    TestCase.assertEquals(1,new storeDelete(testArr).deletstore("back"));
    TestCase.assertEquals(0,new storeDelete(testArr).deletstore("肯德雞"));

/*
try {
   Method method = storeDelete.getClass().getMethod("deletstore", String.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

}
