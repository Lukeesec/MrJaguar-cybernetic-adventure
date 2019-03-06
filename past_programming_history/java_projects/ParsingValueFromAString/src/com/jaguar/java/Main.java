package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.12";
        System.out.println("NumberAsString= " + numberAsString);
        double number = Double.parseDouble(numberAsString); //converts to a int from a string. Actual name is repaclases
        System.out.println("number = " + number);

        numberAsString += 1; //acts like a word and adds another *word*
        number += 1; //acts like a integer and adds one.

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

    }
}