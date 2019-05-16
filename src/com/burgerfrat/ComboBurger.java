package com.burgerfrat;
//Written by Carla Pastor
public class ComboBurger extends BasicBurger{
    public ComboBurger() {
        super("Combo", "Beef", "White", 10.50);
        super.trackBurgerAddition1("Fries",0.99);
        super.trackBurgerAddition2("Soda", 1.50);
    }

    @Override
    public void trackBurgerAddition1(String name, double price) {
        System.out.println("(Do not add anything else to this combo)");
    }

    @Override
    public void trackBurgerAddition2(String name, double price) {
        System.out.println("(Do not add anything else to this combo)");
    }

    @Override
    public void trackBurgerAddition3(String name, double price) {
        System.out.println("(Do not add anything else to this combo)");
    }

    @Override
    public void trackBurgerAddition4(String name, double price) {
        System.out.println("(Do not add anything else to this combo)");
    }
}