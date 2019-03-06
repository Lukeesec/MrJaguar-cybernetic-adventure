package com.jaguar.java;

import java.util.Scanner;

public class MobilePhone {

    private static Contacts contacts = new Contacts("Default", "Default");
    private static Scanner scanner = new Scanner(System.in);

    public void gui() {
        boolean quit = false;
        int choice = 0;

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
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private void printInstructions() {
        System.out.println("\t0: To show the options.");
        System.out.println("\t1: To show the contacts list.");
        System.out.println("\t2: To add a contact.");
        System.out.println("\t3: To remove a contact.");
        System.out.println("\t4: To modify a contact.");
        System.out.println("\t5: To search for a contact.");
        System.out.println("\t6: To quit the program.");
    }

    private void printContactList() {
        contacts.printContactList();
    }

    private void addContact() {
        System.out.println("Please enter a phone number. ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter a name. ");
        String name = scanner.nextLine();
        if (contacts.isCopyOfName(name)) {
            contacts.addContactList(phoneNumber, name);
        } else {
            System.out.println("Sorry you already have that name in your contact list.");
        }
    }

    private void removeContact() {
        System.out.println("Please enter in the contact place holder number. ");
        contacts.removeConctactList(scanner.nextInt() - 1);
        scanner.nextLine();
    }

    private void modifyContact() {
        removeContact();

        System.out.println("Please enter a new phone number. ");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Please enter a new name. ");
        String newName = scanner.nextLine();
        contacts.addContactList(newPhoneNumber, newName);
    }

    private void searchContact() {
        System.out.println("Please enter in the contact name you want to search for. ");
        String searchName = scanner.nextLine();
        System.out.println(contacts.searchForContact(searchName));
    }
}
