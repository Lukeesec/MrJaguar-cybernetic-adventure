package com.jaguar;

public class Main {

    public static void main(String[] args) {

        int sumOfEvenNumbers = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            //The order of things really matter.. Putting certain things in a different order will
            //obviously give different outcomes
            sumOfEvenNumbers++;
            if (sumOfEvenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Sum of even numbers " + sumOfEvenNumbers);
    }

    public static boolean isEvenNumber(int a) {
        if ((a % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

//
//        int count = 1;
//
//        while (count != 6) {
//            System.out.println("Count value is " + count); //Same as for statement
//            count++;
//
//        }
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count); //Same as for statement
//            count++; //this increments count by one each loop and once it is 6 the loop exits
//        }
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if(count >100) {
//                break;
//            }
//        } while (count != 6);
//    }
//}


/*

        int count = 1;

        while(true) {
            if(count < 101) {
                if(a % count == 0 )
                    count++;
                if(count == 10) {
                    break;
                }
            }
        }

 */
/*



        for (int i = a; i < 100; i++) {
        if (a % i == 0) {
        count++;
        System.out.println("Even number " + i);
        if (count == 10) {
        break;
        } else {
        System.out.println("Not even ");
        }
        }
        }


*/

/*

        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count); //Same as for statement
            count++;

        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);  //Same as While statement
        }
    }
}

 */