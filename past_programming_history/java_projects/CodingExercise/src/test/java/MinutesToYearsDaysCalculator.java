//package com.jaguar;
//
//public class MinutesToYearsDaysCalculator {
//
//    public static void main(String[] args) {
//
//        printYearsAndDays(525600);  //original amount = 1y 0d
//        printYearsAndDays(1051200); //original amount = 2y 0d
//        printYearsAndDays(561600);  //original amount = 1y 25d
//
//    }
//
//    /* TIPS-- Use the remainder operator
//hour = 60 mins
//1 day = 24 hrs
//1 year = 365 days
//   */
//
//    public static void printYearsAndDays(long minutes) {
//        if (minutes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//
//            long hours = minutes / 60;
//            long days = hours / 24;
//            long years = days / 365;
//            long remainingDays = days % 365;
//
//            System.out.println(minutes + "min = " + years + "y " + remainingDays + "d");
//        }
//    }
//}

/* Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from minutes parameter

If the parameter is less than 0, Print text "Invalid value"
Otherwise if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes. YY represents the calculated years. ZZ represents the calculated days.
*/

/* TIPS-- Use the remainder operator
hour = 60 mins
1 day = 24 hrs
1 year = 365 days
 */