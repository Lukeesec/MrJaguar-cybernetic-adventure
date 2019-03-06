package com.jaguar.java;

public class Main {

    public static void main(String[] args) {

        Printer thePrinter = new Printer(2, 0, true);
        System.out.println("Initial page count equals " + thePrinter.getNumberOfPagesPrinted());
        int pagesPrinter = thePrinter.printPages(1);
        System.out.println("Pages printed was " + pagesPrinter + ",new total is " + thePrinter.getNumberOfPagesPrinted());
        pagesPrinter = thePrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinter + ",new total is " + thePrinter.getNumberOfPagesPrinted());
        thePrinter.tonerAdder(122);
        System.out.println(thePrinter.getTonerLevel());
    }
}
