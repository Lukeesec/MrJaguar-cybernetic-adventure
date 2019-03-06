//package com.jaguar;
//
//public class DecimalChecker {
//
//    public static void main(String[] args) {
//
//
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // should return true
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // should return false
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // should return true
//
//    }
//
//    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
//
//        a = a*1000;
//        b = b*1000;
//
//        int x = (int)b;
//        int y = (int)a;
//
//        if(x == y) {
//            return true;
//        }
//            return false;
//    }
//}
