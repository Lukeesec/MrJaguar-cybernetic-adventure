package com.jaguar.java;

public class Hamburger {
    /*

     */
    private String name;
    private String bread;
    private String meat;
    private double price;

    private String addition1;
    private double additionPrice1;

    private String addition2;
    private double additionPrice2;

    private String addition3;
    private double additionPrice3;

    private String addition4;
    private double additionPrice4;

    public Hamburger(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public void addHamBurgerAddition1(String name, double price) {
        this.addition1 = name;
        this.additionPrice1 = price;
    }

    public void addHamBurgerAddition2(String name, double price) {
        this.addition2 = name;
        this.additionPrice2 = price;
    }

    public void addHamBurgerAddition3(String name, double price) {
        this.addition3 = name;
        this.additionPrice3 = price;
    }

    public void addHamBurgerAddition4(String name, double price) {
        this.addition4 = name;
        this.additionPrice4 = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + "Hamburger" + " on a " + this.bread + " roll" + ", meat type " + this.meat + ",price is " + this.price);

        if (this.addition1 != null) {
            hamburgerPrice += this.additionPrice1;
            System.out.println("Added " + this.addition1 + " for an extra " + this.additionPrice1);
        }

        if (this.addition2 != null) {
            hamburgerPrice += this.additionPrice2;
            System.out.println("Added " + this.addition2 + " for an extra " + this.additionPrice2);
        }

        if (this.addition3 != null) {
            hamburgerPrice += this.additionPrice3;
            System.out.println("Added " + this.addition3 + " for an extra " + this.additionPrice3);
        }

        if (this.addition4 != null) {
            hamburgerPrice += this.additionPrice4;
            System.out.println("Added " + this.addition4 + " for an extra " + this.additionPrice4);
        }
        return hamburgerPrice;
    }

//    public void subTotal() {
//        price = additionPrice1 + additionPrice2 + additionPrice3 + additionPrice4 + baseBurgerPrice;
//        System.out.println("Sub total plus the base burger price is: " + price);
//    }
}

