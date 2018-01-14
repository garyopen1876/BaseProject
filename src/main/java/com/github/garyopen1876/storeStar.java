package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeStar {
    public void storeStar(ArrayList<storeData> x){
        int checkstoreStar1=0;
        Scanner ScannerstoreStar = new Scanner(System.in);
        storeMakeStar storeMakeStar= new storeMakeStar();
        System.out.println("=======================================");
        System.out.println("歡迎來到提供店家評價");
        while (checkstoreStar1 == 0) {
            int checkwronginput4=0;
            int checkstoreStar2=0;
            if(x.size()==0){              /*矩陣為空的時候*/
                checkstoreStar1++;
                continue;
            }
            System.out.println("=======================================");
            System.out.print("請輸入想要知道評價的店家:");
            System.out.println("(輸入back返回主介面):");
            String showWhichstoreStar = ScannerstoreStar.next();
            for (int l = 0; l < x.size(); l++) {
                if ( showWhichstoreStar.equals(x.get(l).getName())) {
                    checkwronginput4++;
                    for (int loop= 0; loop < 30; loop++) {
                        System.out.println("");
                    }
                    System.out.println("===============================================================");
                    System.out.println("星星評價由低到高(1~5)");
                    System.out.println(x.get(l).getName()+"的星星評價為 "+x.get(l).getStar()+"顆星");
                    System.out.println("評價人數為"+x.get(l).getStarPeople());
                    System.out.println("===============================================================");
                    while(checkstoreStar2==0){
                        System.out.println("=======================================");
                        System.out.println("請選擇進行項目:");
                        System.out.println("1.我要評分!!");
                        System.out.println("2.我要觀看其他店家的評價");
                        System.out.println("=======================================");
                        int iWantstoreStar = ScannerstoreStar.nextInt();
                        switch(iWantstoreStar){
                            case 1:
                                storeMakeStar.storeMakeStar(x,l);        /*進入storeMakeStar*/
                                checkstoreStar2++;
                                break;
                            case 2:
                                checkstoreStar2++;
                                for (int loop= 0; loop < 30; loop++) {
                                    System.out.println("");
                                }
                                break;
                            default:
                                System.out.println("輸入錯誤!!請再輸入一遍");
                                break;
                        }

                    }
                } else if ( showWhichstoreStar.equals("back")) {
                    checkstoreStar1++;
                    continue;
                }
            }
            if(checkwronginput4==0){
                System.out.println("找不到該店家");
            }
        }
        for (int loop= 0; loop < 30; loop++) {
            System.out.println("");
        }
    }
}
