package com.jaguar;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 2000) {                           // code blocks are the stuff between brackets
//            System.out.println("Your score was less then  5000 but greater then 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less then 1000");
//
//        } else {
//            System.out.println("Got here");
//        }


        //or u can do if (gameOver) its essentially the same
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }






        /*
        reason that finalScore isnt working. It is because once the code block above runs its code it deletes
        all the variables that it creates inside that ^^ code block (int savedFinalScore = finalScore;)
         */

    }
}
