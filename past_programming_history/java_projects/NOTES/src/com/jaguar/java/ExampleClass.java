package com.jaguar.java;

import java.util.ArrayList;

public class ExampleClass {

    // Explanation on how to use the actual names of the items u want to search for instead of the index postions

    ArrayList<String> myTestString = new ArrayList<String>();

    public static void main(String[] args) {
        ExampleClass exampleArrayList = new ExampleClass();

        exampleArrayList.test();
        exampleArrayList.print();

        System.out.println("Showing what indexOfDoes: " + exampleArrayList.findString("Josh"));

        exampleArrayList.modifyStringDifClass();
        exampleArrayList.print();

    }

    /**
     * Adds three strings to the arrayList
     */
    public void test() {
        myTestString.add("Luke");
        myTestString.add("Josh");
        myTestString.add("Nathan");
    }

    /**
     * uses a for loop to print each string in the myTestString
     */
    public void print() {
        for (int i = 0; i < myTestString.size(); i++) {
            System.out.println((i + 1) + ". " + myTestString.get(i));
        }
    }

    /**
     * Input the string u want to find.. And the indexOf will check if that string is in the arrayList. If so
     * it will return the index it is at
     */
    public int findString(String string) {
        return (myTestString.indexOf(string));
    }

    public void modifyString(String currentName, String newName) {
        //Checks if the String nathan is in the array
        int position = findString(currentName);
        if (position >= 0) {
            /**If the nathan is in the array it will set position to whatever nathan was at in the index
             thoses two parameters will be passed to the overloaded method modfyString**/
            modifyString(position, newName);
            //Then sets a new name at the position
        }
    }

    public void modifyString(int position, String newName) {
        /**Retrieves the 2 parameters in the first modifyString method
         Then uses the position found by using findString method and sets a newName**/
        myTestString.set(position, newName);
        //Outputs that
        System.out.println("String name " + (position + 1) + " has been modified");
    }

    public void modifyStringDifClass() {
        //Please enter in the string name u wanted to modify
        String currentName = "Luke"; //User inputs Luke
        //Please enter in the new string name
        String newName = "LukeyPookie"; //User inputs LukeyPookie
        modifyString(currentName, newName);
    }
}




//Explanation on using ONLY objects in a arrayList

class ExampleClass1 {

    public static void main(String[] args) {
        ExampleClass1 exampleClass1 = new ExampleClass1("Default first name", "Default last name");
        //I would've thought that it would be ExampleClass1.add("Captain","Jaguar")
        exampleClass1.add(exampleClass1);
        exampleClass1.print();
    }

    private String name;
    private String lastName;
    private ArrayList<ExampleClass1> arrayList;

    public ExampleClass1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        //Initializing the exampleArrayList
        this.arrayList = new ArrayList<ExampleClass1>();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    //Seems like using ExampleClass1 exampleClass1 just makes life easier.
    public void add(ExampleClass1 exampleClass1) {
        //Adding two strings to the objects name and lastName that are in the arrayList
        arrayList.add(new ExampleClass1("Captain", "Jaguar"));
    }

    //Loops through untell (i) is more then the arrayList
    public void print() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + ". " + " First name: " + arrayList.get(i).getName()
                    + "\nLast name: " + arrayList.get(i).getLastName());
        }
    }





    //HOW TO DO TWO ARRAYLISTS SIDE BY SIDE

//    public void printAll() {
//        int minSize = Math.min(originalR6.size(), userInputedR6.size());
//        for (int i = 0; i < minSize; i++) {
//            System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), originalR6.get(i), (i + 1), userInputedR6.get(i));
//        }
//        if (originalR6.size() < userInputedR6.size()) {
//            for (int i = minSize; i < userInputedR6.size(); i++) {
//                System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), "was not answered", (i + 1), userInputedR6.get(i));
//            }
//        } else if (originalR6.size() > userInputedR6.size()) {
//            for (int i = minSize; i < originalR6.size(); i++) {
//                System.out.printf("%d. %-10s %d. %-10s%n", (i + 1), originalR6.get(i), (i + 1), "was not answered");
//            }
//        }
//    }


    //LINKED LISTS
    /** Linked lists use much less memory when adding and removing things from it.. One item points to another
     * hannah -> luke -> mom -> ally
     * hannah is point to luke and luke is pointing to hannah.. If u were to remove luke then hannah points
     * to whatever luke was pointing to.. When you want to add a item say between luke and mom then whatever luke was
     * pointing. the new item then points to it
     */



}
