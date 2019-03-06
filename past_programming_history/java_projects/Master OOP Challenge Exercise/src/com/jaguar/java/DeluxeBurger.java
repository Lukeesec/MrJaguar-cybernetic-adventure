package com.jaguar.java;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & bacon", 14.67);
        super.addHamBurgerAddition1("Chips",2.75);
        super.addHamBurgerAddition2("Drink",1.75);
    }

    @Override
    public void addHamBurgerAddition1(String name, double price) {
        System.out.println("Cannont add addition items to a DB burger");
    }

    @Override
    public void addHamBurgerAddition2(String name, double price) {
        System.out.println("Cannont add addition items to a DB burger");
    }

    @Override
    public void addHamBurgerAddition3(String name, double price) {
        System.out.println("Cannont add addition items to a DB burger");
    }

    @Override
    public void addHamBurgerAddition4(String name, double price) {
        System.out.println("Cannont add addition items to a DB burger");
    }
}

//do later
//Not allowed to have any additions
