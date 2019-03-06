package com.jaguar.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Making scanner and GroceryList class accessible
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        //This all keeps going unless the user enters in 7 in which the boolean will equal true and it will end the while
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocerylist();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArraylist();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    /**
     * Static abuse???????
     */

    //Our menu using our switch statements.
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify a item in the list.");
        System.out.println("\t4 - To remove an item in the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - To copy the array list.");
        System.out.println("\t7 - To quit the application.");
    }

    /**Now we are using the methods in GroceryList using the instance of at the top of the class
     * This area is pretty self explanatory
     */

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        //whaterver they typed will be added to the GroceryList method
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArraylist() {
        //copied all of grocerylist to a new array.
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println("Copied grocery list to a new grocery list");
        //Above and below are the same thing.. But the above is wasteful and the below is not wasteful.
//        ArrayList<String> anotherArray = new ArrayList<String>(groceryList.getGroceryList());
//
//        //converting to a array
//        String[] myArray = new String[groceryList.getGroceryList().size()];
//        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
