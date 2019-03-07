package com.jaguar.java;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

//
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

//
class Purge extends Movie {
    public Purge() {
        super("Purge");
    }

    @Override
    public String plot() {
        return "24 hrs of everything";
    }
}

//
class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Tryin to get out of a maze";
    }
}

//
class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Ships fighting in a galaxy";
    }
}

//
class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //No Plot method
}

public class Main {
    /*
    Polymorphism is the method. That makes actions work differently based on the actual object.. (idk forsure yet)
     */
    public  static void main(String[] args) {

        for (int i = 1; i <11 ; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new Purge();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

        }
        return null;
    }
}
