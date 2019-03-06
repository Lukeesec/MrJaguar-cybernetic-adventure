//package com.jaguar;
//
//public class AreaCalculator {
//
//    public static void main(String[] args) {
//
//        //Inputs
//        System.out.println(area(5.0)); // Correct
//        System.out.println(area(-1)); // Correct
//        System.out.println(area(5.0, 4.0)); // incorrect
//        System.out.println(area(-1.0, 4.0)); // incorrect
//
//        /* Make one method named area with one parameter type double named radius. CHECKED
//
//         The method needs to return a double value that represents the area of a circle. CHECKED
//
//         If the parameter radius is negative then return -1.0 to represent a invalid value. CHECKED
//
//         Write another overloaded method with 2 parameters x and y type double, Where x and y represent
//         the sides of the rectangle.
//
//         The method needs to return an area of a rectangle.
//
//         if either or both parameters is/are negative return -1.0 to indicate a invalid value.
//       */
//
//    }
//
//    public static double area(double radius) { // First method (Overloading)
//
//        if(radius < -0) {
//            return -1.0;
//        }
//
//        double pi = 3.14159;
//        double rad = radius * radius * pi;
//
//        return rad;
//    }
//
//    /* Formulas--
//    Formula for calculating a circle is radius * radius * PI. For PI use numbers 3.14159
//    Formula for calculating a rectangle is x * y.
//     */
//
//    public static double area(double x, double y) { // Second method (Overloading)
//
//        if(x < -0 || y < -0) {
//            return -1.0;
//        }
//
//        double rect = x * y;
//
//        return rect;
//    }
//}
