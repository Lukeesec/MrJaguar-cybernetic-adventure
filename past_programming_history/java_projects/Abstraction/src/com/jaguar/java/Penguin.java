package com.jaguar.java;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Im not very good at that, Would go for a swim instead.");
    }
}
