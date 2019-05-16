package com.burgerfrat;
//Written by Carla Pastor

public class VeggieBurger extends BasicBurger {
    private String veggieOption1; private double veggiePrice1;
    private String veggieOption2; private double veggiePrice2;

    public VeggieBurger(double basicPrice) {
        super("Veggie Burger", "Tofu", "Brown", basicPrice);
    }
    public void trackVeggieOption1(String name, double price){
        this.veggieOption1 = name;
        this.veggiePrice1 = price;
    }
    public void trackVeggieOption2(String name, double price){
        this.veggieOption2 = name;
        this.veggiePrice2 = price;
    }

    @Override
    public double totalPriceBurger() {
        double veggieTotalPrice = super.totalPriceBurger();
        if(this.veggieOption1!=null){
            veggieTotalPrice+=this.veggiePrice1;
            System.out.println("Added: " + this.veggieOption1 + " for an extra: $" + this.veggiePrice1);
        }
        if(this.veggieOption2!=null){
            veggieTotalPrice+=this.veggiePrice2;
            System.out.println("Added: " + this.veggieOption2 + " for an extra: $" + this.veggiePrice2);
        }
        return veggieTotalPrice;
    }
}//end of Veggie Class
