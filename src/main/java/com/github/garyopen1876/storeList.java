package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeList {

    public  ArrayList<storeData> storeNameList(ArrayList<storeData> x) {
        Scanner Scannerstorelist = new Scanner(System.in);
        int checkStoreNameList = 0;
        storeIntroduction storeIntroduction=new storeIntroduction();
        storeDelete storeDelete=new storeDelete();
        System.out.println("=======================================");
        System.out.println("歡迎來到尋找店家");
            while (checkStoreNameList == 0) {
                System.out.println("==========店家列表==========");
                for (int i = 0; i < x.size(); i++) {
                    System.out.println(x.get(i).getName());
                }
                System.out.println("=======================================");
                System.out.println("請輸入進行項目:");
                System.out.println("1.檢視店家資料");
                System.out.println("2.刪除不喜歡店家");
                System.out.println("3.返回主介面");
                System.out.println("=======================================");
                int choosestorelist = Scannerstorelist.nextInt();
                switch (choosestorelist) {
                    case 1:
                        storeIntroduction.IntroductionShow(x);
                        break;
                    case 2:
                        storeDelete.deletStore(x);
                        break;
                    case 3:
                        checkStoreNameList++;
                        break;
                    default:
                        System.out.println("輸入錯誤!!請再輸入一遍");
                        break;
                }
            }
        for (int loop= 0; loop < 30; loop++) {
            System.out.println("");
        }
        return x;
    }

}
