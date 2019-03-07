//public class EvenDigitSum {
//
//    public static void main(String[] args) {
//
//         System.out.println(getEvenDigitSum(123456789)); //true
//        System.out.println(getEvenDigitSum(22)); //true
//        System.out.println(getEvenDigitSum(-22)); //false because reverse is 21211 and that is not equal to 1221
//
//    }
//
////    damn new way is so much better
//    public static int getEvenDigitSum(int number) {
//        if (number < 0) {
//            return -1;
//        }
//
//        int reversedNumber = 0;
//        int sum = 0;
//        int num2 = 0;
//
//        while (number != 0) {
//reversedNumber *= 10;
//            num2 = reversedNumber + number % 10;
//            number /= 10;
//This reverses any given number ^^
//
//            if (num2 % 2 == 0) {
//                sum += num2;
//            }
//        }
//        return sum;
//    }
//}
//