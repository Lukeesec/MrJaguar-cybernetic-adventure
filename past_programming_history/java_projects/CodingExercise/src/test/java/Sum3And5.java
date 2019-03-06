package com.jaguar;

public class Sum3And5 {

    public static void main(String[] args) {
        /*
          //How this works is.. i (Any number up to 1000) divided by 5 and the remainder
         //is equal to 0 and then if i is divided by 3 and the remainder is equal to o
         //Then whatever number that gets outputted is divisible by 3 and 5
         */


        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number is = " + i);
            }
            if (count == 1000) {
                break;
            }
        }
        System.out.println("sum  = " + sum);
    }
}



/* Sum of 3 and 5 challenge
Use a for statement a range of numbers from 1 to 1000 (Inclusive) CHECKED
Sum all the numbers that can be divided with both 3 and also 5
For those numbers that met above condition, print out the number.

Break out of the loop once you find 5 numbers that meet the above conditions
after breaking out of the loop print the sumof the numbers that met the above conditions

Type all code in main method


 */
