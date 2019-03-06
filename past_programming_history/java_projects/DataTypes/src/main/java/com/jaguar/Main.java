package com.jaguar;

public class Main {

    public static void main(String[] args) {

        int myInteger = 50;
        short myShort = 20;
        byte myByte = 10;

        long myLong = 50000L + 10L * (myByte + myShort + myInteger);

        System.out.println(myLong);


    }

}

/*
        //integer width of 32
        int myMinValue = -2_147_483_648;
        int myMiaxalue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("My total = " + myTotal);


        //byte width of 8                                   //Use the right data type for the project.. More numbers = longer cumpute time
        byte myByteValue = 127;             //variables are like little boxes that can store certain amounts of data
        byte myByteVaule1 = -128;
        byte myNewByteValue = (byte) (myByteValue/2 + myByteVaule1/2);
        System.out.println("My new byte value = " + myNewByteValue);


        //short width of 16
        short myShortVaule = -32768;
        short myShortVaule1 = 32767;
        short myNewShortValue = (short) (myShortVaule/2 + myShortVaule1/2);


        //long has a width of 64
        long myLongValue = 100L; //big ass number
 */
