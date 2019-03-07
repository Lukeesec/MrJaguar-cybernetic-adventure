/*package com.jaguar;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(10); //Should print "One Two Three" //123
        //numberToWords(1010); //Should print "One Zero One Zero"
        //numberToWords(1000); //Should print "One Zero Zero Zero"
        //numberToWords(-12); //Should print "Invalid Value"

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversed = reverse(number);
            int digitsCount = getDigitCount(number);
            int lastDigit;
            String printDigit = "";

            while (digitsCount != 0) { //This while statement just gets the last digit in a number
                lastDigit = reversed % 10;
                switch (lastDigit) { //Takes a given number and converts it to a string **reversed**
                    case 0:
                        System.out.println("Zero ");
                        break;
                    case 1:
                        System.out.println("One ");
                        break;
                    case 2:
                        System.out.println("Two ");
                        break;
                    case 3:
                        System.out.println("Three ");
                        break;
                    case 4:
                        System.out.println("Four ");
                        break;
                    case 5:
                        System.out.println("Five ");
                        break;
                    case 6:
                        System.out.println("Six ");
                        break;
                    case 7:
                        System.out.println("Seven ");
                        break;
                    case 8:
                        System.out.println("Eight ");
                        break;
                    case 9:
                        System.out.println("Nine ");
                        break;
                }
                System.out.print(printDigit);
                reversed/=10;
                digitsCount--;
            }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;

        while (number != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + number % 10;
            number = number / 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}

/* Use a for loop to print zeros after reversing the number.
e.g 100 reversed is 1 so it needs to print "One Zero Zero". To get the number of zeros check the difference between
the digit count from the original number and the reversed number.
*/

/*
/* Write a method called numberToWords with one int parameter named number. //CHECKED
The method needs to print out the passed number using words for the digits. //CHECKED

If the number is negative then print "Invalid Value" //CHECKED

To print the number in words use the following steps. //CHECKED

1.Extact last digit of the given number using the remainder operator (number % 10) //CHECKED
2.Switch the value of digit found above. There are 10 possible values of digits those being 0,1,2,3,4,5,6,7,8,9. //CHECKED
Print the correct corresponding word for each digit. e.g print "ZERO" if digit is 0,"ONE" if digit is 1, and so on.  //CHECKED
3.Remove the last digit from the number. //CHECKED
4.Repeat step 2 through 4 untill the number is 0. //CHECKED

The logic above is correct but the words will be printed in reverse order. For example if the number is 1234 the
logic above will produce the output"Four Three Two" instead of "Two Three Four". To overcome this problem write
a second method called reverse. //CHECKED

The reverse method has one int parameter and returns the returns the reversed number (int) For example if the number
passed is 234 then the reversed number returned would be 432. //CHECKED

The reverse method should also negative numbers. Use the reverse method in the numberToWords method then print the
words in correct order.

For the number 100 the reverse number is 001. The logic above for the method numberToWords will print"One" but that is
incorrect it should print "One Zero Zero".

To solve the problem with leading zeros write a third method getDigitCount.

the getDigitCount method has one int parameter number and returns the count of digits in that number. If the number
negative then return -1 to indicate an invalid value.

If the number has the value of 100 then he method getDigitCount needs to return 3 since the number is 100 has 3 digits
 */