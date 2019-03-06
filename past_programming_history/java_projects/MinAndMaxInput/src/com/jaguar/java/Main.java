package com.jaguar.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       // boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if(number == 1237){
                    System.out.println("Holy Cow Man!!! You just got the luckiest freaking jackpot.. Idek how GG");
                    break;
                }

            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("Min number is: " + min + " Max number is: " + max);
        scanner.close();
    }
}
/*

 */