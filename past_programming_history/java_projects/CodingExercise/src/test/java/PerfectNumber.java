/*package com.jaguar;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6)); //true
      // System.out.println(isPerfectNumber(28)); //true
      //  System.out.println(isPerfectNumber(5)); //false
       // System.out.println(isPerfectNumber(-1)); //false

    }
//UNDERSTAND THIS LATER
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
            if (temp == number)
            return true;
        }
        return false;
    }
}

/*
What is a perfect number? A perfect number is a positive integer which is equal to the sum of its proper
positive divisors. Proper positive divisors are positive integers that fully divide the perfect number without
leaving a remainder and exclude the perfect number itself. For example, take the number 6: its proper divisors are 1,2 and 3
(since 6 is the value of the perfect number, It is excluded),and the sum of this proper divisors is 1 + 2 + 3 = 6.
Therefor, 6 is a perfect number(as well as the first perfect number)

Write a method named isPerfectNumber with one parameter type int named number.
If number < 1 then the method should return false.

The method must calculate if the number is perfect. If the number is perfect the method should return true; otherwise,
it should return false..

Use a while or for/Remainder operator
 */
