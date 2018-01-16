package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;

public class storeMakeStar {
    public ArrayList<storeData> storeMakeStar(ArrayList<storeData> x, int l){
        Scanner ScannerstoreMakeStar = new Scanner(System.in);
        System.out.println("請給這家店你心中的分數吧(只能輸入0~5喔!!!!):");
        double iGivePoint=ScannerstoreMakeStar.nextFloat();
        if(iGivePoint<0||iGivePoint>5){              /*防止不乖的使用者*/
            for (int loop= 0; loop < 30; loop++) {
                System.out.println("");
            }
            System.out.println("=======================================");
            System.out.println("不是跟你說只能0~5之間嗎= =");
            System.out.println("重新再來 掰掰");
            System.out.println("=======================================");
        }else {
            double originalStar = x.get(l).getStar();
            x.get(l).setStarPeople();         /*評價人數+1*/
            int newStarPeople =x.get(l).getStarPeople();
            double sumStar = (iGivePoint + originalStar) /newStarPeople ;
            x.get(l).setStar(sumStar);
            for (int loop = 0; loop < 30; loop++) {
                System.out.println("");
            }
            System.out.println("=======================================");
            System.out.println("評價成功!!請重新檢視這家店的評價");
            System.out.println("=======================================");
        }
        return x;
    }
}
