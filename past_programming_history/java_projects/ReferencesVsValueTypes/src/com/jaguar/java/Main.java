package com.jaguar.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntValue);
        //Value types.. A single space in memory stores the data. If u store it in another variable then they both work independently

        //Array is a reference types. A reference holds a reference to the object but not to the object it self. A reference is a address in the memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //myIntArray and anotherArray hold the same address

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
