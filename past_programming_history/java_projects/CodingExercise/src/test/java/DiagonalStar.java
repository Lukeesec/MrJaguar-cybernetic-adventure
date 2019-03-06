/*package com.jaguar;

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(5);

    }

    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= n; ++j) {
                    if (i == 1 || i == n || j == 1 || j == n)
                        System.out.printf("*");
                    else if (i == j || i == n - j + 1)
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
                System.out.printf("\n");
            }
        }
    }
}


/*
The pattern above consist of a number of rows and columns(where number is the number of rows to print)
For each row or column, stars are printed bases on four conditions,

-In the first or last row
-In the first or last column
-When the row number equals the column number
-When the column number equals rowCount - currentRow + 1 (Where currentRow is current row number)
Hint use a nested for loop (one for loop inside another)
 */