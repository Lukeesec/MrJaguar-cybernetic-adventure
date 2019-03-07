package com.jaguar.java;

public class Player<T extends Player> implements Comparable<Player<T>> {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Player<T> o) {
        return 0;
    }

    public String getName() {
        return name;
    }
}
