package com.jaguar;

public class Main {

    public static void main(String[] args) {

        //width of a integer is = 32 (4 bytes)
        int myIntValue = 5/2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;
        //width of double = 62 (8 byte)
        double myDoubleValue = 5d/3d;  //Float and Double are precision numbers. (decimals)

        System.out.println("MyIntValue " + myIntValue);
        System.out.println("MyFloatValue " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);


        //Converts pounds to kilo

        double numPounds = 200d;
        double convertedKilos = numPounds * .45359237d;
        System.out.println(numPounds + " pounds = " + convertedKilos + " kilos");

    }
}
