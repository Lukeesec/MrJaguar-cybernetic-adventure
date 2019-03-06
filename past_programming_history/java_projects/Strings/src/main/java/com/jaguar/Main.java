package com.jaguar;

public class Main {

    public static void main(String[] args) {


        //primitive types in java

        //byte
        //short
        //int
        //long
        //float
        //double
        //char     Can contain one character / unicode
        //boolean

        //String can be considered a primitive but its not

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.50";
        numberString = numberString + "49.95";
        System.out.println("the result is " + numberString);

        String lastString = "10";
        int myint = 50;
        lastString = lastString + myint;
        System.out.println("Last string is eqaul to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value " + lastString);

    }
}
