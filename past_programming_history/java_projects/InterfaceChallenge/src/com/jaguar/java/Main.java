package com.jaguar.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Players luke = new Players("Luke",15,10);
        System.out.println(luke.toString());
        saveObject(luke);
      //  loadObject(luke);
        System.out.println(luke);

        Monster skeleton = new Monster("Skeleton",10,20);
        System.out.println(skeleton);
        System.out.println("Strength = " + skeleton.getStrength());
        saveObject(skeleton);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        scanner.close();
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for (int i = 0; i <objectToSave.write().size() ; i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




//    public static void printUserInput(ArrayList<String> printValues) {
//        System.out.println("Items saved by user: ");
//        for (int i = 0; i < printValues.size(); i++) {
//            System.out.println((i + 1) + ". " + printValues.get(i));
//        }
//    }
}
