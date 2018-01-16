package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeStar {

    public void storeStar(ArrayList<storeData> likeStar){
        int checkprint=0;
        int i = 0;
        String WhichStore=new String();
        Scanner ScannerstoreStar = new Scanner(System.in);
        storeMakeStar storeMakeStar= new storeMakeStar();
        ArrayList<storeData> newLikeStar=new ArrayList<storeData>();;
        System.out.println("=======================================");
        System.out.println("歡迎來到提供店家評價");
            int checkstoreStar2=0;
            System.out.println("=======================================");
            System.out.println("請輸入想要過濾的評價範圍(0~5)，輸入-1、-1返回主介面:");
            System.out.println("評價範圍(低):");
            double start = ScannerstoreStar.nextInt();
            System.out.println("評價範圍(高):");
            double end = ScannerstoreStar.nextInt();
            if(start == -1 && end == -1){
                for (int loop= 0; loop < 30; loop++) {
                    System.out.println(" ");
                }
                System.out.println("返回主介面");
                checkstoreStar2++;
            }
            if(checkstoreStar2==0) {
                for (int loop= 0; loop < 30; loop++) {
                    System.out.println("");
                }
                System.out.println("======="+start+"~"+end+"顆星的店家======");
                int flag = 0;

                for (i = 0; i < likeStar.size(); i++) {
                    if (likeStar.get(i).getStar() >= start && likeStar.get(i).getStar() <= end) {
                        newLikeStar.add(likeStar.get(i));
                        System.out.println(newLikeStar.get(flag).getName());
                        flag++;
                    }
                }
                System.out.println("=======================================");
            }
            while(checkstoreStar2==0){
                System.out.println("=======================================");
                System.out.println("請選擇進行項目:");
                System.out.println("1.我要評分!!");
                System.out.println("2.我要觀看店家的詳細資料");
                System.out.println("3.返回主畫面");
                System.out.println("=======================================");
                int iWantstoreStar = ScannerstoreStar.nextInt();
                switch(iWantstoreStar){
                    case 1:
                        System.out.println("請輸入欲評分之店家名稱:");
                        WhichStore = ScannerstoreStar.next();
                        for (i = 0; i < newLikeStar.size(); i++) {
                            if(WhichStore.equals(newLikeStar.get(i).getName())) {
                                storeMakeStar.storeMakeStar(newLikeStar,i);        /*進入storeMakeStar*/
                            }
                        }
                        break;
                    case 2:
                        checkprint=0;
                        System.out.println("請輸入店家名稱");
                        WhichStore = ScannerstoreStar.next();
                        for (i = 0; i < newLikeStar.size(); i++) {
                            if (WhichStore.equals(newLikeStar.get(i).getName())) {
                                System.out.println("===============================================================");
                                System.out.println(newLikeStar.get(i).getName());
                                System.out.println("平均價格為:" + newLikeStar.get(i).getMoney() + "元");
                                System.out.println("位於:" + newLikeStar.get(i).getWhereStore());
                                System.out.println(newLikeStar.get(i).getIntroduction());
                                System.out.println(newLikeStar.get(i).getName() + "的星星評價為 " + newLikeStar.get(i).getStar() + "顆星");
                                System.out.println("評價人數為" + newLikeStar.get(i).getStarPeople());
                                System.out.println("===============================================================");
                                System.out.println();
                                checkprint++;
                                break;
                            }
                        }
                        if(checkprint==0) {
                            System.out.println("查無店家!!");
                        }
                        break;
                    case 3:
                        checkstoreStar2++;
                        break;
                    default:
                        System.out.println("輸入錯誤!!請再輸入一遍");
                        break;
                }
            }
        }

}
