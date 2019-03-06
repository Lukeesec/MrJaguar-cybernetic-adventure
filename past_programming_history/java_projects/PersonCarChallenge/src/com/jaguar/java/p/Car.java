package com.jaguar.java.p;

import java.util.Random;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String randomize(String[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }

    public String getName() {
        return name;
    }
}
