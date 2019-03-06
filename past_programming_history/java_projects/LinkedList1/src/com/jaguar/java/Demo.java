package com.jaguar.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> placesToVist = new LinkedList<String>();
        addInOrder(placesToVist, "Texas");
        addInOrder(placesToVist, "Hawaii");
        addInOrder(placesToVist, "South Carolina");
        addInOrder(placesToVist, "North Carolina");
        addInOrder(placesToVist, "Outer Banks");
        addInOrder(placesToVist, "Aloha");
        addInOrder(placesToVist, "Z");
        printList(placesToVist);
        vist(placesToVist);
        placesToVist.add("s");
    }


    //PRINT LIST
    private static void printList(LinkedList<String> linkedList) {
        //Sorta same as a for loop
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) { //While the linked list is pointing at something
            System.out.println("Now visting " + i.next());
        }
        System.out.println("===================================");
    }

    //adds item in list then puts it in order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0) {
                //equal, Do not add.
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparision > 0) {
                //New city should appear before this one
                System.out.println("");
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void vist(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingFoward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cites in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        /** Switch statement
         * action 1 checks if there is something to *next* to and if not it will output - reached end of list
         * action 2 checks if there is something to *previous* to and if not it will output - we are at the start of the list
         *
         * boolean goingFoward fixs any loops..
         */
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if (!goingFoward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingFoward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingFoward = false;
                    }
                    break;

                case 2:
                    if (goingFoward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        } else {
                            goingFoward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingFoward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0- To end the holiday." +
                "\n1- To go to the next city." +
                "\n2- To go to the previous city." +
                "\n3- To show the available actions again");
    }
}
