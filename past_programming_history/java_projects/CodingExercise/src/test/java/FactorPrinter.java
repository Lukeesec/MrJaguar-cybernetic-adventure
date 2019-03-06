/*package com.jaguar;

public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(6); //1 2 3 6
        //  System.out.println(printFactors(32)); //1 2 4 8 16 32
        //  System.out.println(printFactors(10)); //1 2 5 10
        //  System.out.println(printFactors(-1)); //Invalid Value

    }

    public static void printFactors(int number) {

        int c = 1, a = 0;

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            a = number % c;
            if (a == 0) {
                System.out.println(c);
            }
            if (c == number) {
                break;
            }
            c++;
        }
    }
}
/*
The method should print all factors of the number.. A factor of a number is an integer which divides that number wholly..
Without leaving a remainder***



 */
/*
public ArrayList<Integer> findFactors(int num) {
    ArrayList<Integer> factors = new ArrayList<Integer>();

    // Skip two if the number is odd
    int incrementer = num % 2 == 0 ? 1 : 2;

    for (int i = 1; i <= Math.sqrt(num); i += incrementer) {

        // If there is no remainder, then the number is a factor.
        if (num % i == 0) {
            factors.add(i);

            // Skip duplicates
            if (i != num / i) {
                factors.add(num / i);
            }

        }
    }

    // Sort the list of factors
    Collections.sort(factors);

    return factors;
}
 */