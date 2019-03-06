package com.jaguar.java;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    /*
    What encapsulation is doing here is. We are setting a default hitPoints for the field hitPoints.. And we are only
    setting the hitPoints if it follows our if statement. Making it so that the hitPoints be more or less then what we've set
    here
     */

    public EnhancedPlayer(String name, int health, String weapon) {

        //need to figure out a good way to check alot of words
        if(("shit").equals(name)) {
            System.out.println("Sorry that name is not allowed.");
        } else {
            this.name = name;
        }

        if(health > 0 && health <= 100)
            this.hitPoints = health;

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for payer
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
