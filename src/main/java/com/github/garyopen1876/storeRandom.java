package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Random;

import java.util.Scanner;

public class storeRandom {
    public void storeRandom(ArrayList<storeData> x) {
        int checkstorerandom = 0;
        Random ran2= new Random();
        Scanner Scannerstorerandom = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("歡迎來到由系統隨機建議你吃甚麼");
        while (checkstorerandom == 0) {
            if (x.size() == 0) {              /*矩陣為空的時候*/
                checkstorerandom++;
                continue;
            }
            int whatstore1=ran2.nextInt(x.size());
            System.out.println("你今天非常適合吃"+x.get(whatstore1).getName()+"呢!!");
            System.out.println("=======================================");
            System.out.println("1.我覺得不準啦!!!!再一次");
            System.out.println("2.返回主介面");
            System.out.println("=======================================");
            System.out.println("請輸入進行項目:");
            int choosestorerandom = Scannerstorerandom.nextInt();
            switch (choosestorerandom) {
                case 1:
                    for (int loop = 0; loop < 30; loop++) {
                        System.out.println("");
                    }
                    break;
                case 2:
                    checkstorerandom++;
                    break;
                default:
                    System.out.println("輸入錯誤!!請再輸入一遍");
                    break;
            }


        }
        for (int loop = 0; loop < 30; loop++) {
            System.out.println("");

        }
    }
}
