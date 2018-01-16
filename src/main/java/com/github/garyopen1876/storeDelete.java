package com.github.garyopen1876;

import java.util.ArrayList;

import java.util.Scanner;



public class storeDelete {

    private ArrayList<storeData> x;

    public storeDelete(ArrayList<storeData> x){
        this.x=x;
    }

    public ArrayList<storeData> deletStore(boolean test){
        if(test == false) {
            int checkDelete = 0;
            String deleteWhichStore;
            while (checkDelete == 0) {
                deleteWhichStore = choose(false);
                checkDelete = deletstore(deleteWhichStore);
            }
        }
        return x;
    }


    protected String choose(boolean test) {
        Scanner ScannerstoreDelete = new Scanner(System.in);
        if (x.size() == 0) {              /*矩陣為空的時候*/
            for (int loop = 0; loop < 30; loop++) {
                System.out.println("");
            }
            System.out.println("小調皮你把店家都刪光光啦><");
            return "back";
        }
        if(test == false) {
            System.out.println("=======================================");
            System.out.print("請輸入想刪除的店家");
            System.out.println("(輸入back返回搜尋店家介面):");
            String deleteWhichStore = ScannerstoreDelete.next();
            return deleteWhichStore;
        } else {
             return "麥當勞";
         }
    }

        protected int deletstore(String deleteWhichStore) {
            int loop=0;
            if (deleteWhichStore.equals("back")) {
                System.out.println("=======================================");
                System.out.println("返回搜尋店家介面");
                System.out.println("=======================================");
                return 1;
            } else{
                for (int k = 0; k < x.size(); k++) {
                    if (deleteWhichStore.equals(x.get(k).getName())) {
                        (this.x).remove(k);
                        System.out.println("=======================================");
                        System.out.println("已刪除該店家");
                        System.out.println("=======================================");

                        return 1;
                    }
                }
                System.out.println("=======================================");
                System.out.println("找不到該店家");
                System.out.println("=======================================");
                return 0;
        }
    }

}
