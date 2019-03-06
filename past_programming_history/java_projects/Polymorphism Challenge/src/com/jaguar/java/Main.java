package com.jaguar.java;

class Car {

    private boolean engine;
    private String name;
    private int cylinders = 6;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        if (cylinders > 0 && cylinders <= 6) {
            this.cylinders = cylinders;
        }
    }

    public String startEngine() {
        return "-> Starting engine";
    }

    public String Accelerating() {
        return "-> Accelerating";
    }

    public String brake() {
        return "Car -> Braking";
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
//--------

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi-> Starting engine ";
    }

    @Override
    public String Accelerating() {
        return "Audi-> Accelerating ";
    }

    @Override
    public String brake() {
        return "Audi -> Braking ";
    }
}
//--------

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche-> Starting engine ";
    }

    @Override
    public String Accelerating() {
        return "Porsche-> Accelerating ";
    }

    @Override
    public String brake() {
        return "Porsche -> Braking ";
    }
}
//--------

class Lambo extends Car {
    public Lambo(String name, int cylinders) {
        super(name, cylinders);
    }


    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Starting engine ";
    }

    @Override
    public String Accelerating() {
        return getClass().getSimpleName() + " Accelerating ";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  "-> Braking ";
    }
}

public class Main {

    /*
    return getClass().getSimpleName() +
    So u dont need to hard code the name of the car.. Makes life easier but is a bit more code.
     */
    public static void main(String[] args) {
        Car car = new Car("Default car",7); //used Encapsulation so that the cylinders cant be more then 6
        System.out.println(car.getCylinders());
        System.out.println(car.brake() + car.Accelerating() + car.startEngine());

        Audi audi = new Audi("Sporty Audi",6);
        System.out.println(audi.brake() + audi.Accelerating() + audi.startEngine());

        Porsche porsche = new Porsche("Sporty porsche",6);
        System.out.println(porsche.brake() + porsche.Accelerating() + porsche.startEngine());

        Lambo lambo = new Lambo("Sporty lambo",6);
        System.out.println(lambo.brake() + lambo.Accelerating() + lambo.startEngine());

    }
}
