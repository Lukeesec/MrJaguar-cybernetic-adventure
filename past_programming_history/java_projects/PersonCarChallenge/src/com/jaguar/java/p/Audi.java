package com.jaguar.java.p;

public class Audi extends Car{

    private String[] personalName = {"Good Ol Beth","Ruthy","Jaguar","Cheetah"};
    private String[] colorList = {"Yellow","Blue","Orange","Black","Purple"};
    private String[] turboBoost = {"25MPH","50MPH","75MPH","100MPH"};

    public Audi() {
        super("Audi");
    }

    public void randomizeColor() {
        System.out.println("The color of the " + getName() + " is: " + randomize(colorList));
    }

    public void randomizePersonalName() {
        System.out.println("The personal name of the " + getName() + " is: " + randomize(personalName));
    }

    public void randomizeTurboBoost() {
        System.out.println("The max turbo boost power of the  " +  getName() + " is: " + randomize(turboBoost));
    }


}
