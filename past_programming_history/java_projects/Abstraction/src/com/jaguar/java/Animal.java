package com.jaguar.java;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void eat();
    public abstract void breath();
    public abstract void move();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
