package com.burgerfrat;

public class BasicBurger {
    private String burgerName;
    private String meatType;
    private String basicBread;
    private double basicPrice;
    private String nameAddition1;   private double priceAddition1;
    private String nameAddition2;   private double priceAddition2;
    private String nameAddition3;   private double priceAddition3;
    private String nameAddition4;   private double priceAddition4;

    public BasicBurger(String burgerName, String meatType, String basicBread, double basicPrice) {
        this.burgerName = burgerName;
        this.meatType = meatType;
        this.basicBread = basicBread;
        this.basicPrice = basicPrice;
    }
    public void trackBurgerAddition1(String name, double price){
        this.nameAddition1 = name;
        this.priceAddition1 = price;
    }
    public void trackBurgerAddition2(String name, double price){
        this.nameAddition1 = name;
        this.priceAddition1 = price;
    }
    public void trackBurgerAddition3(String name, double price){
        this.nameAddition1 = name;
        this.priceAddition1 = price;
    }
    public void trackBurgerAddition4(String name, double price){
        this.nameAddition1 = name;
        this.priceAddition1 = price;
    }
    public double totalPriceBurger(){
        double totalBurgerPrice = this.basicPrice;
        System.out.println(this.burgerName + " hamburger " + "on a " + this.basicBread + " basic bread. Price is: $" + this.basicPrice);

        if(this.nameAddition1!=null){
            totalBurgerPrice = totalBurgerPrice + this.priceAddition1;
            System.out.println("Added: " + this.nameAddition1 + " for an extra: $" + this.priceAddition1);

        }
        if(this.nameAddition2!=null){
            totalBurgerPrice = totalBurgerPrice + this.priceAddition2;
            System.out.println("Added: " + this.nameAddition2 + " for an extra: $" + this.priceAddition2);

        }
        if(this.nameAddition3!=null){
            totalBurgerPrice = totalBurgerPrice + this.priceAddition3;
            System.out.println("Added: " + this.nameAddition3 + " for an extra: $" + this.priceAddition3);

        }
        if(this.nameAddition4!=null){
            totalBurgerPrice = totalBurgerPrice + this.priceAddition4;
            System.out.println("Added: " + this.nameAddition4 + " for an extra: $" + this.priceAddition4);

        }
        return totalBurgerPrice;
    }
}//end BasicBurger class
