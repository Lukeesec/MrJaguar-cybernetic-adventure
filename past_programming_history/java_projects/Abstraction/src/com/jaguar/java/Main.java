package com.jaguar.java;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        dog.eat();
        dog.move();
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println("");
        Parrot parrot = new Parrot("Hoote Hoe","Orange");
        parrot.breath();
        parrot.eat();
        parrot.move();
        parrot.fly();

        Penguin penguin = new Penguin("Impra","Orange");
        penguin.fly();

    }
}
