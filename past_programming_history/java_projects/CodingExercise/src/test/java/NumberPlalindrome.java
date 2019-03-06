/*package com.jaguar;

public class NumberPlalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1221)); //true
        System.out.println(isPalindrome(707)); //true
        System.out.println(isPalindrome(11212)); //false because reverse is 21211 and that is not equal to 1221

    }

    //damn new way is so much better
    public static int isPalindrome(int number) {


        int reversedNumber = 0;
        int sum = 0;

        while (number != 0) {
            reversedNumber *= 10; //0 //10 //120
            reversedNumber += number % 10; //1 //2 //2
            number /= 10; //122 //12 //1

            if(reversedNumber % 2 == 0) {
                sum = sum + reversedNumber;

            }



        }
        return -1;
    }
}

/* Number Plalindrome
Write a method isPlalindrome with int parameter called number. CHECKED
THe method needs to return boolean CHECKED
is should return true if the number is a plalindrome otherwise return false. CHECKED

check tips below ---
A plalindrome is when a number is put in reverse its the same as it was before
Find the reverse of the number and store it in some type of variable (reverse). Compare the number
with reverse. If both are same then its a plalindrome otherwise its not.

Logic tip.
Declare and initialize another variable to store the reverse of a number, for example reverse=0 CHECKED

extract the last digit of the given number by performing modulo division. (refer to DigitSumChallenge) Checked = -1
Store the last digit to some variable say lastDigit = num % 10 Checked -1
Increase the place value of reverse by one.
to increase place the value multiply reverse variable by 10 e.g reverse = reverse = *10
Add last digit to reverse. CHECKED
Since last digit of num is processed, remove last digit of num. To remove last digit divide by 10.
Repeat steps until num is not equal to or greater than zero.

A while loop would be good for this coding exercise.
Be careful when reversing a number, you will need a parameter for comparing a reversed number with the starting number
(parameter)

 */
/* MY FAILED ATTEMPT
    public static boolean isPlalindrome(int number) {

        int tempNum = number; //Giving number a temp variable
        int reverse = 0;
        int lastDigit = 0;
        int anotherTemp = 0;
        int thirdTemp = 0;

        while (number != 0) {
            lastDigit = lastDigit + tempNum % 10; //remainder is 3

            reverse = reverse * 10 + lastDigit; // reverse is now 3

            tempNum = tempNum /10; //tempNum is now 12 as a int

            anotherTemp = tempNum % 10; // anotherTemp is equal to 2

            thirdTemp = reverse * 10 + anotherTemp; // reverse is now 32

            tempNum = tempNum / 10; // tempNum is equal to 1

            tempNum = tempNum % 10; //tempNum is now 1

            reverse = reverse * 10 + tempNum;


            if (reverse == number) {
                return true;

            }
        }
        return false;
    }
}

 */
/*
  reversedNumber *= 10; //0 //0 //0 //0 --
            reversedNumber += number % 10; //1 //3 //5 //6 --
            number /= 10; //122 //12 /1 //0 --
 */