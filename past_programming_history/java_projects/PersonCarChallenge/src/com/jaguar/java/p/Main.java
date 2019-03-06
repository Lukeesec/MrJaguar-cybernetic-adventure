package com.jaguar.java.p;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Default");
        System.out.println(car.getName());

        Audi audi = new Audi();
        System.out.println(audi.getName());
        audi.randomizeColor();
        audi.randomizePersonalName();
        audi.randomizeTurboBoost();
    }
}
