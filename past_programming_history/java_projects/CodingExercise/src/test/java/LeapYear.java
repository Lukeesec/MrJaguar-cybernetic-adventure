//package com.jaguar;
//
//public class LeapYear {
//
//    public static void main(String[] args) {
//
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//
//
//    }
//
//    public static boolean isLeapYear(int year) {
//
//        if (!(year >= 1 && year <= 9999)) {
//            return false;
//        } if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            return true;
//        }
//
//        return false;
//    }
//
//
//}


/*
The parameter needs to be greater then or equal to 1 and less then or equal to 9999

If the parameter is not in that range return false;

Otherwise, if it is in the valid range, calc if the year is a leap year and return true if it is. otherwise
return false.

a year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.


 */