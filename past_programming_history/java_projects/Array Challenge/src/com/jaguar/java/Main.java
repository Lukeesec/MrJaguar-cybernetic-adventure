package com.jaguar.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Highest to lowest
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " values.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
            //All done by my self zero help other then referring to my last coding exercise
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            //created a copy of the array and passing it to sorted so it cna then be sorted.
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array,array.length); //faster way then doing the above way

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            //Element 0 = 50
            //Element 1 = 160
            //Element 2 = 40
            /*
            if element 0 is less then element 1 then it will swap and keep doing it tell its sorted through the array.
             */
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}












