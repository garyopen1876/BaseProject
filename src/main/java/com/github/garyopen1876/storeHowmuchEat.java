package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeHowmuchEat {
    public void storeHowmuchEat(ArrayList<storeData> x) {
        int checkstorehowmucheat=0;
        Scanner Scannerstorehowmucheat = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("歡迎來到檢視現有金額能吃甚麼");
        while (checkstorehowmucheat == 0) {
            if(x.size()==0){              /*矩陣為空的時候*/
                checkstorehowmucheat++;
                continue;
            }
            System.out.println("=======================================");
            System.out.println("1.檢視現有金額能吃甚麼");
            System.out.println("2.返回主介面");
            System.out.println("=======================================");
            System.out.println("請輸入進行項目:");
            int choosestorehowmucheat = Scannerstorehowmucheat.nextInt();
            switch (choosestorehowmucheat) {
                case 1:
                    for (int loop = 0; loop < 30; loop++) {
                        System.out.println("");
                    }
                    int howmanycaneat=0;
                    System.out.println("請輸入目前現有的手頭金額:");
                    int mymoney = Scannerstorehowmucheat.nextInt();
                    System.out.println("你能吃的店家有...");
                    for(int n=0 ; n < x.size() ; n++){
                        if(mymoney >= x.get(n).getMoney()){
                            System.out.println(x.get(n).getName());
                            howmanycaneat++;
                        }
                    }
                    if(howmanycaneat==0){
                        System.out.println("你有夠窮!!!你甚麼都吃不起啦");
                    }
                    break;
                case 2:
                    checkstorehowmucheat++;
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
