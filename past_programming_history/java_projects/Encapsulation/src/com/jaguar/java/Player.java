package com.jaguar.java;

public class Player {

    public String fullName;
    public int hitPoints;
    public String weapon;

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for payer
        }
    }

    public int healthRemaining() {
        return this.hitPoints;
    }
}
