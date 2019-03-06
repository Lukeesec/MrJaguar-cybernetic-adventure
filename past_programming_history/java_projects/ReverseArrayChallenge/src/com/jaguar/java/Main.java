package com.jaguar.java;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] numberArray = {1, 24, 31, 43, 5, 6};
        System.out.println("Array before reversing " + Arrays.toString(numberArray)); //passes the array to a string
        reverse(numberArray);
        System.out.println("Array after reversing " + Arrays.toString(numberArray));
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            //reverses a given array

        }

//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
    }
}

