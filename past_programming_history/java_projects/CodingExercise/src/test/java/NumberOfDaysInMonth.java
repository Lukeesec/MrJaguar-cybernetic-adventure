/*package com.jaguar;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600)); //false
        System.out.println(isLeapYear(1600)); //true
        System.out.println(isLeapYear(2017)); //false
        System.out.println(isLeapYear(2000)); //true

        System.out.println(getDaysInMonth(1, 2020)); //should return 31 snce jan has 31 days
        System.out.println(getDaysInMonth(2, 2020)); //should return 29 since feb has 29 days in a leap year (2020leapyr)
        System.out.println(getDaysInMonth(3, 2018)); //should return 28 since feb has 28 days (not a leap yr 2018)
    }

    public static boolean isLeapYear(int year) {
//Checks if the year is a leap year and if it is returns true
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    //This method returns how many days are in a certain month of the year
    //And a added bonus it uses isLeapYear to check if a specific month is a leap year or (month) I dont know
    //anything about leap years.
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        switch(month) {
            case 1: //jan 31 days
            case 3: //march 31 days..
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: //all theses cases will return 31
                return 31;
            case 2:
                if(isLeapYear(year)) //checks if its a leap year and if so then it returns 29 and if not 28
                    return 29;
                else
                    return 28; //Next time i need to read up on how many days are in a month..
            default:
                return 30;
        }
    }
}

//Challenge

//HINT USE A SWITCH STATEMENT
/* getDaysInMonth CHECKED
if the parameter month is <1 or >12 return -1 CHECKED
if the parameter year is <1 or >9999 then return -1 CHECKED

the method needs to return the number of days in the month.
Be careful about leap years they have 29 days in month 2(feb)

You should check if the year is a leap year using the method isLeapYear described above

 */

/* Number of days in a month
Write a method isLeapYear with parameter of type int named year
the parameter needs to be greater then or equal to 1 and less then or equal to 9999
if the parameter is not in range return false

Otherwise, if it is a valid range, calculate if the year is a leap year and return true if it is, otherwise return false

A year is a leap year if it is divisible  by 4 but not by 100, or it is divisible by 400
 */
