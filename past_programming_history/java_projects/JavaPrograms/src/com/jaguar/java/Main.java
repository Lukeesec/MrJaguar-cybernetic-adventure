package com.jaguar.java;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {


        /** Use arrays for fixed values.. */
        String[] strArray = new String[10]; //Or {"boo","ba"}
        int[] intArray = new int[10];

        /** Use array lists for things that need to be updated changed and removed..
         * Makes life 10x easier */
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Luke<3");

        /** But we can make a class and *reference* it in the arrayList (I think reference is the word)
         * then we can just use the intClassArrayList and add a number.
         * (This adds the object of type IntClass)
         * So the code below is a little messy.. Having to make getters and setters in another class and all that stuff..
         * So thats why java made **AutoBoxing and UnBoxing**
         */
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        System.out.println(intClassArrayList.get(0).getMyValue()); //Gets index 0 then gets the value from it using getMyValue.

        Integer integer = new Integer(54);
        Double doubleValue = new Double(42.1);

//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10; i++) {
//            //AutoBoxing
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            //Unboxing
//            System.out.println((i + " ---> " + integerArrayList.get(i).intValue()));
//        }

        Integer myIntValue = 56;
        int myInt = myIntValue;

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.00; dbl <= 10.0; dbl += 0.5) {
            //AutoBoxing converting a primitive type double to the object
            doubleArrayList.add((dbl));
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            //Unboxing converting it from the object back into the primitive type double
            double value = doubleArrayList.get(i);
            System.out.println(i + " --> " + value);
        }


    }
}
