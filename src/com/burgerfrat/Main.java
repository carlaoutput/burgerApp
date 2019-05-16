package com.burgerfrat;
//Written by Carla Pastor

public class Main {

    public static void main(String[] args) {
	    BasicBurger basicBurger = new BasicBurger("Basic", "Beef", "White", 8.50);
        double finalPrice = basicBurger.totalPriceBurger();

        //test
        basicBurger.trackBurgerAddition1("Bacon", 0.99);
        basicBurger.trackBurgerAddition2("Chees",  0.50);
        basicBurger.trackBurgerAddition3("Onions", 0.50);

        System.out.println("Total price is: $" + basicBurger.totalPriceBurger() + "\n");

        VeggieBurger veggieBurger = new VeggieBurger(7.00);

        veggieBurger.trackBurgerAddition1("SoyBeans", 0.50);
        veggieBurger.trackVeggieOption2("Seeds", 0.50);
        System.out.println("Total price is: $" + veggieBurger.totalPriceBurger() + "\n");

        ComboBurger combo = new ComboBurger();
        combo.trackBurgerAddition1("chips", 1.90);
        System.out.println("Total Combo price is: $" + combo.totalPriceBurger());
    }
}
