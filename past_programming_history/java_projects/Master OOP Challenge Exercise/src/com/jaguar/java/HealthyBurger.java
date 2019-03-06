package com.jaguar.java;

public class HealthyBurger extends Hamburger {

    private String healthyAddition1;
    private double healthyExtra1Price;

    private String healthyAddition2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy burger", "Brown rye bread", meat, price);
    }
    //MAX 6 addons

    public void addHamburgerAddition5(String name, double price) {
        this.healthyAddition1 = name;
        this.healthyExtra1Price = price;
    }

    public void addHamburgerAddition6(String name, double price) {
        this.healthyAddition2 = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyAddition1 != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyAddition1 + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyAddition2 != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyAddition2 + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
//do later
//Up to 6 additional items
