package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;



public class storeDelete {

    public ArrayList<storeData> deletStore(ArrayList<storeData> x) {
       int checkDelete = 0;
       Scanner ScannerstoreDelete = new Scanner(System.in);
       while (checkDelete == 0) {
              int checkwronginput3=0;
               if(x.size()==0){              /*矩陣為空的時候*/
                     for (int loop= 0; loop < 30; loop++) {
                          System.out.println("");
                     }
                     System.out.println("小調皮你把店家都刪光光啦><");
                     checkDelete++;
                     continue;
               }
               System.out.println("=======================================");
               System.out.print("請輸入想刪除的店家");
               System.out.println("(輸入back返回搜尋店家介面):");
               String deleteWhichStore = ScannerstoreDelete.nextLine();
               for (int k = 0; k < x.size(); k++) {
                     checkwronginput3++;
                     if (deleteWhichStore.equals(x.get(k).getName())) {
                         for (int loop= 0; loop < 30; loop++) {
                             System.out.println("");
                         }
                         x.remove(k);
                         System.out.println("=======================================");
                         System.out.println("成功刪除該店家");
                         System.out.println("=======================================");
                         checkDelete++;
                         continue;
                      } else if (deleteWhichStore.equals("back")) {
                         for (int loop= 0; loop < 30; loop++) {
                             System.out.println("");
                         }
                         checkDelete++;
                         continue;
                     }
                }
                if(checkwronginput3==0){
                 System.out.println("輸入錯誤!!請再輸入一遍");
                 }
       }
           return x;
    }

}
