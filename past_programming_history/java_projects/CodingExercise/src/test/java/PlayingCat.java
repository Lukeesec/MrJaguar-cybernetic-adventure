/*package com.jaguar;

public class PlayingCat {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10)); // should return false since the temp is not in range of 25-45
        System.out.println(isCatPlaying(false, 36)); // should return false since the temp is not in range of 25-35
        System.out.println(isCatPlaying(false, 35)); //should return true since the temp is in range 25-35

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if ((temperature >= 25 && temperature <= 35) || (summer && (temperature >= 25 && temperature <= 45))) {
            return true;
        } else
        return false;
    }
}


/*
If its summer and the temp is between 25 - 45 return true otherwise return false
 */
//If it is summer then the cats have a wider range 25-45 instead of 25-35 if its not summer

/* Playing Cat
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35. Unless its
summer, then the upper limit is 45 instead of 35.

Write a method isCatPlaying that has 2 parameters. Method needs to be return true if a cat is playing, otherwise false.

1Fst parameter should be type boolean and be named summer it represents if it is summer. 2nd parameter represents
the temperature and is of type int with the name temperature.



 */
