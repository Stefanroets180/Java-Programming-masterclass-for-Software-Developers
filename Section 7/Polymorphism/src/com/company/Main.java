package com.company;

class Movie{
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

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take ofer the world";
    }
}
class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids trying to escape a clever maze.";
    }
}

class StartWars extends Movie {

    public StartWars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial Forces trying to take ofer the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No Plot method
}

public class Main {

    public static void main(String[] args) {
	    for(int i=1; 1<11; i++) {
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
                                                "Plot: " + movie.plot() +"\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random Number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StartWars();

            case 5:
                return new Forgetable();
        }

        return null;
    }
}
