package com.jaguar.java;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name,String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in out repeat");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flappin their wings");
    }
}
