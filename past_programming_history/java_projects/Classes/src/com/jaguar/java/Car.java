package com.jaguar.java;

import java.util.Scanner;

public class Car {

    private int doors;
    private int wheels;
    private String brand; //fields
    private String engine;
    private String color;

    public void setModel(String brand) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick one of the listed models: Porsche,Jaguar,Audi,BMW");
         brand = scanner.nextLine(); //making a variable so i can mess with what happens once a player types a model.
        String isValidModel = brand.toLowerCase();

        //Four possible brands

        if(isValidModel.equals("porsche") || isValidModel.equals("jaguar") || isValidModel.equals("audi") || isValidModel.equals("bmw")) {
            this.brand = brand;
        } else {
            System.out.println("Unknown model");
        }


    }

    public String getModel() {
        return this.brand;
        //dont know what to do with.
    }



//WILL CHANGE LATER
    public void setColor(String color) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick a color: ");
        color = scanner.nextLine();

        String validColor = color.toLowerCase();
        if (validColor.equals("red") || validColor.equals("black") || validColor.equals("orange") || validColor.equals("blue")) {
            this.color = color;
        } else {
            this.color = "Unknown color";
        }
scanner.close();
    }

    public String getColor() {
        return this.color;
    }
}
