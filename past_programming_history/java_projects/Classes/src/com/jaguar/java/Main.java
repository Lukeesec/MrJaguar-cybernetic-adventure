package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new Car(); //we created a new data type of car named porsche (object porsche)
        Car color = new Car(); //Constructions

        sportsCar.setModel("");
        color.setColor(""); //Setting the color of the car

        System.out.println("Color of the car is " + color.getColor() + " and the brand of the car is a " + sportsCar.getModel());

    }
}
