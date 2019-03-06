package com.jaguar.java;

import java.util.Scanner;

public class Main {

    //Made a scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Giving myIntegers the amount of vaules i want to enter
        int[] myIntegers = getIntegers(5);
        //making a forloop so its less code.. Once it is more then 5 it will stop
        for (int i = 0; i < myIntegers.length; i++) {
            //Printing out the number that I was and doing that 5 times
            System.out.println("Element " + i + " integers value.\r");
        }
        //Using the method we made (return sum) to get the avg for the integers entered
        System.out.println("The average is " + returnSum(myIntegers));
    }
        //Cycling through scanner next 5 times.. everytime a value is entered it will go to the next number in the forloop
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
        //Our average getter
        //to get a avg u take the sub total and add it by the amount of values entered
    public static double returnSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //So our subtotal is sum and it divides by our array.length..
        return (double) sum / (double)array.length;
    }
}




/*
        //[] makes it into a array.. the 10 is how many elements we want stored (learn how to make the burger shop better)

        int[] myIntArray = new int[25];  //{ 1,2,3,4,5,6,7,8,9,10}; //type and how big <also setting>
        //myIntArray[5] = 50; //Setting but its only good if ur doing a small list..

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printAray(myIntArray);
    }

    public static void printAray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
 */