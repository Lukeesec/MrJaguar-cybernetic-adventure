//package com.jaguar;
//
//public class BarkingDog {
//
//    public static void main(String[] args) {
//
//        System.out.println(bark(true,1));
//        System.out.println(bark(true,2));
//        System.out.println(bark(true,8));
//        System.out.println(bark(true,-1));
//    }
//
//    /*
//    This took FOREVER to figure out
//    and its mostly all my doing
//
//     */
//    public static boolean bark (boolean barking, int hourOfDay) {
//
//        if (hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        } if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
//            return true;
//        }
//        return false;
//    }
//}
