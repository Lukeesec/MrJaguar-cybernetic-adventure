/*package com.jaguar;

public class FirstLastDigitSum {

    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(61)); //4
        System.out.println(sumFirstAndLastDigit(257)); //9
        System.out.println(sumFirstAndLastDigit(0)); //0
        System.out.println(sumFirstAndLastDigit(5)); //5
        System.out.println(sumFirstAndLastDigit(-10)); //-1
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        //I NEVER FIGURED THIS ONE OUT.. It was so simple and i was not releasing alot of things
        //I also need to write stuff out if its math

        int lastDigit = number % 10; //1
        while (number > 9) { //once number isnt greater then 9 then this loop ends.
            number/=10; //looped once = 6 -- 61 divided by 10 = 6 and then the loop ends
        } //Need to figure this all out.
        return lastDigit + number;
    }
}
//            lastDigit = number % 10; // 12 % 10 == 2
*/