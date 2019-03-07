package com.jaguar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {

    private String userName;
    private int points;
    private ArrayList<Integer> firstListNum;

    //private static Random rand = new Random();

    public Guess(String userName, int points) {
        this.userName = userName;
        this.points = points;
        this.firstListNum = new ArrayList<Integer>();
    }

    //Randomly generates a number between two given values (secondNumber)
    public void randomNumbers() {
        int firstNum = ThreadLocalRandom.current().nextInt(6, 10);
        firstListNum.add(firstNum);

        int secondNum = ThreadLocalRandom.current().nextInt(1, 5);
        firstListNum.add(secondNum);
    }

    //This method receives the first and second num and randomly chooses a number.
    public int answer() {
        int answer = ThreadLocalRandom.current().nextInt(firstListNum.get(1)+1,firstListNum.get(0)+1);
        return answer;
    }

    //If the userGuess is equal to the answer then 1 point is added. (do I really need this to be a boolean?)
    //not really
    public boolean guessInput(int userGuess, int answer) {
        if (userGuess == answer) {
            this.points = +1;
            return true;
        } else {
            return false;
        }
    }

    //getters and setters
    public String getUserName() {
        return userName;
    }

    public int getPoints() {
        return points;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Integer> getFirstListNum() {
        return firstListNum;
    }
}
