/*package com.jaguar;

public class SumOddRange {

    public static void main(String[] args) {


        System.out.println(sumOdd(1, 100)); //should print 2500
        System.out.println(sumOdd(-1, 100)); //should print -1
        System.out.println(sumOdd(100, 100)); //should print 0
        System.out.println(sumOdd(100, -100)); //should print -1
        System.out.println(sumOdd(100, 1000)); //should print 247500

    }

    public static boolean isOdd(int number) {

        if (number <= 0) {
            return false;
        }
      return (number % 2 == 1); //if there is a remainder then its a odd number..
    }


    public static int sumOdd(int start, int end) {

        int sumOfOdds = 0;

        if (start < 1 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfOdds += i;
            }
        }
        return sumOfOdds;
    }
}
    /* Sum Odd-- TIP use the remainder operator to check if the number is odd. //CHECKED
    Check that number is>0, if its not return false //CHECKED

    Write a second method called sumOfOdd that has 2 parameters type int start and end, //CHECKED
    which represents a range of numbers //CHECKED

      the method should be a for loop to sum all the odd numbers in that range including the end and return the sum.
      It should call the method isOdd to check if the number is odd.

    The parameter end needs to be greater than or equal to start //CHECKED
    and both start and end parameters have to be greater then 0 //CHECKED
    If thoses conditions are not satisfied return -1 //CHECKED
     */

//        for (int i = 1; i < 200; i++) {
//            if ((i % 2 == 0)) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }