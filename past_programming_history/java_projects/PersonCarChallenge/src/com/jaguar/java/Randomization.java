package com.jaguar.java;

import java.util.Random;

public class Randomization {

    public static String getRandom(String[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }
}
