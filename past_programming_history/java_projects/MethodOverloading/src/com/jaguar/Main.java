package com.jaguar;

public class Main {

    public static void main(String[] args) {

        double cenimeters = calcFeetAndInchesToCentimeters(6   ,1); //Putting in a amount to get turned into cm
        if(cenimeters <0.0) {
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100); //Giving the value of 100 inches and converting to 8.0fet and 4.0inches
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0 || (inches > 12)))) {  // This block of code is checking if the values are out of range and if so it returns -1
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double cenimeters = (feet * 12) * 2.54;  //we are multiplying by 12 because thats how many inches are in a cen..
        cenimeters  += inches % 2.54; // slightly confused on this aspect
        System.out.println("Feet, " + feet + " inches = " + cenimeters + "cm "); //displaying the feet incs and cm
        return cenimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) { //method overloading 2

        if(inches < 0) { // validating that inches is more then 0
            return -1; //if its less then 0 then it returns -1 which means you dun messed up
        }

        double feet = (int) inches / 12; // Then this is dividing inches by 12 and getting the remaining then prining it out
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches); //You put in a value all the at a top currently its 100cm. This method converts
                                                                      //that cm given to feet and inches..
    }
}





//        return ((a >= 13 && a <= 19)) || ((b >= 13 && b <= 19)) || ((c >= 13 && c <= 19));


//        int newScore = calcScore("Luke", 500);
//        System.out.println("New score is " + newScore);
//
//        calcScore(75);
//        calcScore();
//    }
//
//    public static int calcScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calcScore(int score) {
//        System.out.println("Unnammed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calcScore() {
//        System.out.println("No player named, no player score.");
//        return 0;
//    }
//
//
//
//
//}
