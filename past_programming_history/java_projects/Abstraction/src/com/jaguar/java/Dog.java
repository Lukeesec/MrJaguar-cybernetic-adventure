package com.jaguar.java;

public class Dog extends Animal {

    public Dog() {
        super("Pete", "Blue");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Breath in out repeat.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving");
    }
}
