package com.jaguar;

public class Main {

    public static void main(String[] args) {

        //Operators

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;

        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result  % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; //adding one to what ever the current result is
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;  //this is a smaller way of doing result = result + number;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;    // = is assigning  a value
        if (isAlien == true)        //    == is testing to see if isAlien equals false
            System.out.println("It is not a alien!");

        int topScore = 80;
        if (topScore < 100)       //   <= is top score less then or equal to 100 >= is the opposite
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))  //    the && is checking to see if the top score equaled 100
            System.out.println("Greater then second top score and less then 100");

        if (topScore >90 || secondTopScore <= 90)
            System.out.println("One of theses test is true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("this is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) //shorter way of doing wasCar == true or false
        System.out.println("was car is true" );

        double myDouble = 20d;
        double mySecDouble = 80d;
        double myFirstTotal = (myDouble + mySecDouble) * 25;
        System.out.println("My total = " + myFirstTotal);   //brackets around my double and mySec makes it so those  get calced first
        double theRemainder = myFirstTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if(theRemainder <= 20)
            System.out.println("Total was over the limit");





















    }

}
