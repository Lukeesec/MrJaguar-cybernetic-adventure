//package com.jaguar;
//
//public class LastDigitChecker {
//
//    public static void main(String[] args) {
//
//        System.out.println(hasSameLastDigit(41, 22, 71));
//        System.out.println(hasSameLastDigit(23, 32, 42));
//        System.out.println(hasSameLastDigit(9, 99, 999));
//        System.out.println(hasSameLastDigit(777, 771, 77)); //true
//
//
//    }
//
//    public static boolean hasSameLastDigit(int a, int b, int c) {
//
//        if (((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || b > 1000))) {
//            return false;
//        }
//
//        a %= 10;
//
//        b %= 10;
//
//        c %= 10;
//
//        if(a == b) {
//            return true;
//        } else if(b == c) {
//            return true;
//        } else if(a == c) {
//            return true;
//        }
//return false;
//    }
//}
//should return true if atleast two of the numbers share the same rightmost digit, Otherwise, it should return false.
//
