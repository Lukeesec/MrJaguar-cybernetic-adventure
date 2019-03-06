package com.jaguar.java;

public class Printer {

    private int tonerLevel = 100; //toner level at amx 100%
    private int numberOfPagesPrinted = 0; //upto 200 pages can be printed
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int tonerAdder(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages /2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }



    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
/*

    public void addToner(int tonerAdder) {
        if (tonerAdder > 0 && tonerAdder <= 100 && tonerAdder + tonerLevel <= 100) {
            this.tonerLevel = tonerLevel + tonerAdder;
        }
    }

    public void removeToner(int tonerRemover) {
        if (tonerRemover)
            this.tonerLevel = tonerLevel - tonerRemover;
    }

    public void pagePrinter(int printPages) {
        if (printPages > 0 && printPages <= 200) {
            this.numberOfPagesPrinted = numberOfPagesPrinted + printPages;
        } else {
            System.out.println("Tried to print to many pages at once");
        }
    }

 */