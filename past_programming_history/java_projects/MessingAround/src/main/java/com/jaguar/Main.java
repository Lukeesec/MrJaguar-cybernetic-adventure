package com.jaguar;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Guess guess = new Guess("Luke", 0);

    public static void main(String[] args) {
        guess.randomNumbers();
        startGame();
    }

    public static void startGame() {
        System.out.println("Starting the Guessing Game :)");
        enterName();
        guessNumber();
    }

    public static void enterName() {
        //   System.out.println("The Guessing Game!");
        System.out.println("Please enter in your name: ");
        String name = scanner.nextLine();
        guess.setUserName(name);
    }

    //Asks the player to guess a number in between the two given values.
    public static void guessNumber() {
        System.out.println("Goal of the game is to try and guess the number in between the two values given. " +
                "\nIf correct 1 point will be given. Have fun!\n");
        System.out.println("Please enter your guess: " + guess.getFirstListNum().get(0) + " - " + guess.getFirstListNum().get(1));

        int userGuess = 0;
        int answer = 0;
        answer += guess.answer();

        do {
            userGuess = scanner.nextInt();
            scanner.nextLine();
            if (userGuess == answer) { //Somehow make a *next level*
                System.out.println("Hurrah!! You have guessed the correct answer and received one points.");
                guess.guessInput(userGuess, answer);
                showStats();
            } else {
                System.out.println("Wrong guess unfortunately. Please re try :)");
            }
        } while (userGuess != answer);
    }

    public static void showStats() {
        System.out.println("Current stats: ");
        System.out.println("Player name: " + guess.getUserName() + "\n Points: " + guess.getPoints());
    }

}
