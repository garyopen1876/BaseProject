package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Random;

public class storeShowTime {
    public  ArrayList<storeData> storeShowTime(ArrayList<storeData> x) {
        Scanner Scannerstoreshowtime = new Scanner(System.in);
        Random ran = new Random();
        int checkStoreShowTime = 0;
        System.out.println("=======================================");
        System.out.println("歡迎來到列出店家等待時間");
        while (checkStoreShowTime == 0) {
            int checkwronginput2=0;
            if(x.size()==0){              /*矩陣為空的時候*/
                checkStoreShowTime++;
                continue;
            }
            System.out.println("=======================================");
            System.out.print("請選擇想要查看時間的店家:");
            System.out.println("(輸入back返回主介面):");
            String showwhichtime=Scannerstoreshowtime.next();
            for (int m = 0; m < x.size(); m++) {
                if (showwhichtime.equals(x.get(m).getName())) {
                    checkwronginput2++;
                    for (int loop = 0; loop < 30; loop++) {
                        System.out.println("");
                    }
                    int time=ran.nextInt(240);
                    if(time==0){
                        System.out.println("=======================================");
                        System.out.println("恭喜你~現在"+x.get(m).getName()+"不需要等待喔");
                        System.out.println("=======================================");
                    }else if(time>59){
                        System.out.println("=======================================");
                        System.out.println("很抱歉~"+x.get(m).getName()+"要等待大約"+time/60+"小時");
                        System.out.println("=======================================");
                    }else{
                        System.out.println("=======================================");
                        System.out.println(x.get(m).getName()+"等待時間為"+time+"分鐘");
                        System.out.println("=======================================");

                    }
                } else if (showwhichtime.equals("back")) {
                    checkStoreShowTime++;
                    continue;
                }
            }
            if(checkwronginput2==0){
                System.out.println("找不到該店家");
            }
         }
        for (int loop = 0; loop < 30; loop++) {
            System.out.println("");

        }
        return x;
    }
}
