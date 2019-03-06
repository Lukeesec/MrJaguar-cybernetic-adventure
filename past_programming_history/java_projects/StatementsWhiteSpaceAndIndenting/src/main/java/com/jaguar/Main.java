package com.jaguar;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //Vaild java statement (Whole Line)
        if (myVariable == 50) {
            System.out.println("Printed");

        }


        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is a " + //still a vaild statement
                " another " +
                "still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");


    }
}
