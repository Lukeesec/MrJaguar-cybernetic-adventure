/*package com.jaguar;

public class greatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15)); //5
        System.out.println(getGreatestCommonDivisor(12, 30)); //6
        System.out.println(getGreatestCommonDivisor(9, 18)); //-1
        System.out.println(getGreatestCommonDivisor(81, 153)); //9

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int a = 0;

        if (second > first) {

            for (int i = first; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }

        } else if (first > second) {
            for (int i = second; i > 0; i--) {
                if ((second % i == 0) && (first % i == 0)) {
                    return i;
                }

            }

        }
        return -1;
    }
}



/*
Hint-- Find the minimum of the two numbers/Use a for or while loop

If one parameter is less then 10 the method should return -1. CHECKED
The method should return the greatest common divisor of the two numbers (int)

The greatest common divisor is the largest positive integer that can fully be
 divide in each of the integers (I.E without leaving a remainder)

 example.. 12 can be divided by 1,2,3,4,6,12
 example.. 30 can be divided by 1,2,3,5,6,10,15,30
 Greatest common divisor is 6. Since both 12 and 30 can be divided by 6 and there is no resulting remainder

 */