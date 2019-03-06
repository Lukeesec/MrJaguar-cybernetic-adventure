package com.jaguar;

public class Main {

    /* Take notes here--
case 1: is pretty much equal to doing if value == 1 do this

if a case is true it then break; and exutes code out of the switch statement

Default means if any other case not covered about this is what i want u to do >>

     */

    public static void main(String[] args) {

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2,3,4 or 5 ");
                break;
        }

        char switchChar = 'G';

        switch (switchChar) {
            case 'A':
                System.out.println("Found a");
                break;
            case 'B':
                System.out.println("Found b");
                break;
            case 'C':
            case 'D':
            case 'E': //checks multiple making the code cleaner
                System.out.println(switchChar + " was found");
                break;

            default:
                System.out.println("Could not find a,b,c,d or e");
                break;
        }
        String switchString = "November";
        switch (switchString.toLowerCase()) {
            case "november":
                System.out.println("November was found");
                break;
            case "October":
                System.out.println("October was found");
                break;

            default:
                System.out.println("October nor November was found");
                break;
        }
    }
}
