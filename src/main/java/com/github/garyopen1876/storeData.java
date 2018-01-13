package com.github.garyopen1876;

public class storeData {
    private String name;
    private String introduction;
    private String whereStore;
    private int money;
    private double star;
    private int starPeople=1;

    public storeData(String name,String introduction,String whereStore,int money,double star) {
        this.name = name;
        this.introduction = introduction;
        this.whereStore = whereStore;
        this.money = money;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getWhereStore() {
        return whereStore;
    }

    public int getMoney() {
        return money;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getStarPeople() {
        return starPeople;
    }

    public void setStarPeople() {
        this.starPeople = starPeople+1;
    }

}
