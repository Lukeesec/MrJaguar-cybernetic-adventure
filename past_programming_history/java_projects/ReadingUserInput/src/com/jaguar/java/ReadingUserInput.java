package com.jaguar.java;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int count = 1;
            int sum = 0;

            for (int i = 0; i < 9; i++) {
                sum += scanner.nextInt();
                count++;
                System.out.println("Enter number: " + count);
            }
            sum += scanner.nextInt();
            System.out.println("The sum of the 10 numbers you entered " + sum);
        } else {
            System.out.println("Invalid Value");
        }

        scanner.close();
    }
}

/*
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAInt = scanner.hasNextInt();

            if (isAInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");

            }

            scanner.nextLine();//handle end of line enter key
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
 */