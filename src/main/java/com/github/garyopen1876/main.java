package com.github.garyopen1876;

import java.util.Scanner;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        storeData store1 = new storeData("麥當勞","著名的連鎖速食店 上午10:15~10:30為餐點供應轉換時間", "407台中市西屯區福星路427號",100,4.0);
        storeData store2 = new storeData("台北江記麻辣臭豆腐","湯頭很濃鬱，豆腐滷的很入味 ，適合冬天品嚐", "407台中市西屯區文華路105之10號",120,3.6);
        storeData store3 = new storeData("小辣椒","便宜大碗，學生吃飽的好選擇", "407台中市西屯區文華路109號",70,3.8);
        storeData store4 = new storeData("陽光老爹Sunny Daddy","簡餐、小火鍋、冰品，冷熱通吃", "407台中市西屯區文華路121號",65,2.8);
        storeData store5 = new storeData("MAK&MAY II‧BESSIE'S KITCHEN","百元有找的好店，雞柳外酥內嫩還有湯汁", "407台中市西屯區文華路133-2號",100,3.6);
        storeData store6 = new storeData("學甲人車輪餅","用料飽滿高cp小小一顆吃起來很過癮", "407台中市西屯區文華路203之2號",10,4.5);
        storeData store7 = new storeData("御方香早餐","價格不貴 飲料15元喝到飽", "407台中市西屯區西安街277巷25弄1號",35,4.2);
        storeData store8 = new storeData("嗚啦啦","音樂環繞效果不錯，價錢便宜好吃。燈光氣氛裝潢良好", "407台中市西屯區文華路179號",90,3.6);
        storeData store9 = new storeData("摩斯漢堡","有光缐明亮的二樓用餐區及戶外區，有逢甲大學的學生證折扣優惠九折！適合用餐及看書！", "407台中市西屯區文華路100號",110,3.9);
        storeData store10 = new storeData("大甲胡媽媽","超好吃辣", "407台中市西屯區文華路179號",35,4.1);

        ArrayList<storeData> x=new ArrayList<storeData>();
        x.add(store1);
        x.add(store2);
        x.add(store3);
        x.add(store4);
        x.add(store5);
        x.add(store6);
        x.add(store7);
        x.add(store8);
        x.add(store9);
        x.add(store10);
        storeList storelist=new storeList();
        storeStar storestar=new storeStar();
        storeShowTime storeshowtime=new storeShowTime();
        storeHowmuchEat storehowmucheat=new storeHowmuchEat();
        storeRandom storerandom=new storeRandom();
        while (true) {
            if (x.size() == 0) {              /*矩陣為空的時候*/
                System.out.println("小調皮你把店家都刪光光啦><");
            }
            System.out.println("=======================================");
            System.out.println("歡迎來到呷嘣");
            System.out.println("1.尋找店家");
            System.out.println("2.提供店家評價");
            System.out.println("3.列出店家等待時間");
            System.out.println("4.檢視現有金額能吃甚麼");
            System.out.println("5.由系統隨機建議你吃甚麼");
            System.out.println("6.離開呷嘣");
            System.out.println("=======================================");

            System.out.println("請輸入進行項目:");
            Scanner scannermain = new Scanner(System.in);
            int choosemain = scannermain.nextInt();
            for (int loop= 0; loop < 30; loop++) {
                System.out.println("");
            }
            switch (choosemain) {
                case 1:
                    storelist.storeNameList(x); /*進入尋找店家*/
                    break;
                case 2:
                    storestar.storeStar(x);/*進入提供店家評價*/
                    break;
                case 3:
                    storeshowtime.storeShowTime(x);/*進入列出店家等待時間*/
                    break;
                case 4:
                    storehowmucheat.storeHowmuchEat(x);/*進入檢視現有金額能吃甚麼*/
                    break;
                case 5:
                    storerandom.storeRandom(x);/*進入由系統隨機建議你吃甚麼*/
                    break;
                case 6:
                    System.out.println("拜託以後請繼續使用喔!!");
                    System.exit(0);
                default:
                    System.out.println("輸入錯誤!!請再輸入一遍");
                    break;
            }
        }

    }
}
