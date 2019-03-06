package com.jaguar;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static R6 r6 = new R6();
    private static Main mainR6 = new Main();

    public static void main(String[] args) {

        //Stuff that needs to be done right at start
        r6.addAll();
        mainR6.instructions();
        mainR6.handler();

    }

    public void handler() {
        //switch statement / way to quit program and print out userInputed/OriginalR6
        boolean quit = false;
        while (!quit) {

            int actions = scanner.nextInt() + -1;
            scanner.nextLine();

            switch (actions) {
                case 0:
                    quit = true;
                    System.out.println("\nProgram ended. See ya later :)");
                    break;
                case 1:
                    mainR6.userInput();
                    break;
                case 2:
                    mainR6.instructions();
                    break;
            }
        }
    }

    public void userInput() {

        String quit = "results";
        String quit1 = "quit";
        String user;
        System.out.println("Have fun and dont cheat ;)" + "\t-- To end program and show your\n results please enter the word --> results <-- \n");
        for (int i = 0; i < r6.originalR6.size(); i++) {

            System.out.println("Please enter a R6 operator: ");
            user = scanner.next().toLowerCase();
            scanner.nextLine();

            if (r6.correctSpelling(user)) {
                r6.addUserInput(user);
                System.out.println(r6.userInputedR6.size() + " out of " + r6.originalR6.size());
            } else {
                System.out.println("What you just entered is one of two things. Incorrect spelling or it isn't a operator");
            }

            if (quit.equalsIgnoreCase(user)) {
                r6.compareAll();
                r6.printAll();
                break;
            }
        }
    }

    public void instructions() {
        System.out.println("Actions that can be done. ");
        System.out.println("1 - To quit program." +
                "\n2 - To start test." +
                "\n3 - To show the actions again.");
    }
}

