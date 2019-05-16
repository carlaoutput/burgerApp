package com.burgerfrat;

public class Main {

    public static void main(String[] args) {
	    BasicBurger basicBurger = new BasicBurger("Basic", "Beef", "White", 8.50);
        double finalPrice = basicBurger.totalPriceBurger();

    }
}
