package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeIntroduction {
    public void IntroductionShow(ArrayList<storeData> x) {
        int checkIntroduction = 0;
        int checkdoonetime = 0;
        Scanner ScannerIntroduction = new Scanner(System.in);
        while (checkIntroduction == 0) {
            if (x.size() == 0) {             /*矩陣為空的時候*/
                for (int loop = 0; loop < 30; loop++) {
                    System.out.println("");
                }
                System.out.println("小調皮你把店家都刪光光啦><");
                checkIntroduction++;
                continue;
            }
            if (checkdoonetime == 0) {
                System.out.println("=======================================");
                System.out.print("請輸入想觀看的店家");
                System.out.println("(輸入back返回搜尋店家介面):");
                String showWhichStore = ScannerIntroduction.next();
                int checkwronginput1 = 0;
                for (int j = 0; j < x.size(); j++) {
                    if (showWhichStore.equals(x.get(j).getName())) {
                        checkwronginput1++;
                        checkdoonetime++;
                        for (int loop = 0; loop < 30; loop++) {
                            System.out.println("");
                        }
                        System.out.println("=======================================");
                        System.out.println(x.get(j).getName());
                        System.out.println("平均價格為:" + x.get(j).getMoney() + "元");
                        System.out.println("位於:" + x.get(j).getWhereStore());
                        System.out.println(x.get(j).getIntroduction());
                        System.out.println("平均星星評價為 " + x.get(j).getStar() + "顆星");
                        System.out.println("=======================================");
                    } else if (showWhichStore.equals("back")) {
                        checkIntroduction++;
                        continue;
                    }
                }
                if (checkwronginput1 == 0) {
                    System.out.println("找不到該店家");
                }
            } else {
                System.out.println("輸入back返回搜尋店家介面");
                String back = ScannerIntroduction.next();
                if(back.equals("back")){
                    checkIntroduction++;
                    continue;
                }else{
                    System.out.println("輸入錯誤!!請再輸入一遍");
                }
            }

        }
        for (int loop = 0; loop < 30; loop++) {
            System.out.println("");
        }

    }
}
