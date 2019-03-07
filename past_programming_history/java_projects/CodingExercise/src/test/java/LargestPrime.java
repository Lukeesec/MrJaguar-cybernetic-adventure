//package com.jaguar;
//
//public class LargestPrime {
//    public static void main(String[] args) {
//
//        System.out.println(getLargestPrime(21));
//
//    }
//    public static int getLargestPrime(int number) {
//        if (number <= 1) {
//            return -1;
//        }
//        for (int i = number; i > 1; i--) {
//            if (number % i == 0 && number / i != 1) {
//                number = i;
//            }
//        }
//        return number;
//    }
//}//all on paper