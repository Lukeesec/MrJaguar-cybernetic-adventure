package com.jaguar;

public class Main {

    public static void main(String[] args) {

        /* What we had before was 4 variables right here
        We removed them because we dont need them due to making them in the
        calcScore method. Then we give the two calcScore methods below the args.
         */


        int highScore = calcScore(true, 800, 5, 100);
        System.out.println("Your final high score " + highScore);

        highScore = calcScore(true, 10000, 8, 200);
        System.out.println("Your final high score " + highScore);


        //THIS NEEDS SOME DRY

        int highScorePosition = calcHighScorePosition(1500);
        displayHighScorePosition("Luke", highScorePosition);

        highScorePosition = calcHighScorePosition(900);
        displayHighScorePosition("Joshua", highScorePosition);

        highScorePosition = calcHighScorePosition(400);
        displayHighScorePosition("Bobers", highScorePosition);

        highScorePosition = calcHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calcHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

    }
    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;

        }

        return -1;

    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " Managed to get in the position "
                + playerPosition + " on the high score table.");

    }

    //Calcs the scores and returns the place they got..
    public static int calcHighScorePosition(int playerScore) {

        int position = 4; //assuming position 4 will be returned
        if (playerScore  >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}

//The "type" of data that a method can receive is referred to as a "parameter".
