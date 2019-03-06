package com.jaguar.java;

import java.util.ArrayList;

public class Contacts {
    /**
     * What I need to do in this class
     * Make a array list that holds the contacts.. A contact is a name and phone number
     * <p>
     * We need to be able to store, modify and query (search) for contact names.
     */
    private String PhoneNumber;
    private String name;
    public ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public Contacts(String phoneNumber, String name) {
        PhoneNumber = phoneNumber;
        this.name = name;
    }

    public void printContactList() {
        System.out.println("You have " + contactsArrayList.size() + " contacts");
        for (int i = 0; i < contactsArrayList.size(); i++) {
            System.out.println((i + 1) + ". " + "Phone number: " + contactsArrayList.get(i).getPhoneNumber() +
                    "\t Name: " + contactsArrayList.get(i).getName());
        }
    }

    public void addContactList(String phoneNumber, String name) {
        contactsArrayList.add(new Contacts(phoneNumber, name));
    }

    public void removeConctactList(int position) {
        contactsArrayList.remove(position);
    }

    public String searchForContact(String searchName) {

        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (searchName.equals(contactsArrayList.get(i).getName())) {
                return (searchName + " has been found.");
            }
        }
        return null;
    }

    public boolean isCopyOfName(String copyOfName) {

        boolean isCopy = true;

        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (copyOfName.equals(contactsArrayList.get(i).getName())) {
                isCopy = false;
            }
        }
        return isCopy;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getName() {
        return name;
    }
}

