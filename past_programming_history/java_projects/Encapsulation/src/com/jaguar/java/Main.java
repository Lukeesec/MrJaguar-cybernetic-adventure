package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        /*
        Encapsulation
         */
//
//        Player player = new Player();
//        player.name = "Luke";
//        player.hitPoints = 20;
//        player.weapon = "Massive rocket?";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining hitPoints equals: " + player.healthRemaining());
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining hitPoints equals: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim",50,"sword");
        System.out.println("Initial hitPoints is " + player.getHitPoints());
    }
}
