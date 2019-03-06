package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        Hamburger defaultBurger = new Hamburger("Default burger","White","organic meat",2.00);
        defaultBurger.addHamBurgerAddition1("Lettuce",.20);
        defaultBurger.addHamBurgerAddition2("Tomato",.50);
        defaultBurger.addHamBurgerAddition3("Cheese",.40);
        defaultBurger.addHamBurgerAddition4("Onion",.40);
        System.out.println("Total burger price is " + defaultBurger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Sausage",6.00);
        healthyBurger.addHamBurgerAddition1("pickles",.60);
        healthyBurger.addHamBurgerAddition2("olives",.70);
        System.out.println("Total healthy price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamBurgerAddition4("SHOULDN'T do this",121);
        db.itemizeHamburger();

        /*
        Just so we all know.. I did all of this by my self.. it was not as pretty and was not as customizable, BUT i didnt let the customers pick anything
        and I didnt let them set their own price like the actual answer did.. I hardcoded 4 types of addons and set prices.. And made it so addition 1 was
        lettuce addition 2 tomato ECT. Not done yet though. Need to work on the healthy burger class and deluxe class
         */
    }
}
