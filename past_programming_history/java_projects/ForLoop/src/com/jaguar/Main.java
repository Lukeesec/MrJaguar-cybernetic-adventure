package com.jaguar;

public class Main {
/*
This right here starts at 10 and stops at 100.. It goes up but one each loop.
We make a variable count to make it so once this method below finds 5 primes it then says "Exiting
for loop" then it breaks and goes to whatever is under it

 */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 20; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
//Our isPrime method to check if a certain number is a prime..
    //Primes can be divided by its self evenly or something so thats why its easy to check..

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
//sqrt is for optimization purposes
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
                if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//Below is just using the for loop to check interest rates.. Pretty simple and makes life easier


/*
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = "+ calculateInterest(10000.0, 2.0));

        //init means its going to get **started** once at the start of the loop?
        //termincation is like (at what point do we exit)
        //Increment.. After each iteration is increases i think
        //i++ is increasing the love everytime it loops by one
        //its going to keep processing untell I isnt less then 5

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("****************************************************************");
        //once i is greater then 9 it exits
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {


        return(amount * (interestRate/100));

    }

}
*/
