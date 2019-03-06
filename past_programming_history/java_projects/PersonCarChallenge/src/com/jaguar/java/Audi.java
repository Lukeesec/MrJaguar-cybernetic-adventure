package com.jaguar.java;

public class Audi extends Car {

    private int turboBoost;
    private String tireColor;

    public Audi(String color, String name, String accents, int turboBoost, String tireColor) {
        super(color, name, accents);
        this.turboBoost = turboBoost;
        this.tireColor = tireColor;
    }

    public int getTurboBoost() {
        return turboBoost;
    }

    public void setTurboBoost(int turboBoost) {
        this.turboBoost = turboBoost;
    }

    public String getTireColor() {
        return tireColor;
    }

    public void setTireColor(String tireColor) {
        this.tireColor = tireColor;
    }
}
