package com.quest.oops.abstraction;

public class MovieMain {
    public static void main(String[] args) {

        Movie actionMovie = new ActionMovie("salaar", 100, "rebelstar");
        Movie comedyMovie = new ComedyMovie("kgf", 100, "prashanth neel");

        System.out.println(actionMovie.toString());
        actionMovie.play();

        System.out.println();

        System.out.println(comedyMovie.toString());
        comedyMovie.play();
    }
}

