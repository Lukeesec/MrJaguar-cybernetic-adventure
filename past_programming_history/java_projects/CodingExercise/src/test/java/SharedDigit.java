/*package com.jaguar;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(22, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(89, 65));
        System.out.println(hasSharedDigit(12, 23));

    }
    //reverses number ^^ //Dont understand the second part of the or statement to much below
    //but i somehow figured it out.. Tried writing out but got confused.. ~LINE 38

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        if ((numberOne < 10) || (numberOne > 99) || (numberTwo < 10) || (numberTwo > 99)) {
            return false;
        }

        int reversed = 0;
        int numberSum = 0;

        int reversed1 = 0;
        int number1Sum = 0;

        while (numberOne + numberTwo != 0) {

            reversed *= 10;
            numberSum = reversed + numberOne % 10;
            reversed1 *= 10;
            number1Sum = reversed1 + numberTwo % 10;
            numberOne /= 10;
            numberTwo /= 10;

            if ((numberSum == number1Sum) || (numberOne == number1Sum) || (numberTwo == numberSum)) {
                return true;
            }
        }
        return false;
    }
}
/*
The method should return true if there is a digit that appears in both numbers.. Otherwise
return false
 */