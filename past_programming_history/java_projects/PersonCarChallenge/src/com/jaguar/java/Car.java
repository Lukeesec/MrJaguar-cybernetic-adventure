package com.jaguar.java;

public class Car {

    private String color;
    private String name;
    private String accents;

    public Car(String color, String name, String accents) {
        this.color = color;
        this.name = name;
        this.accents = accents;
    }


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getAccents() {
        return accents;
    }

}
