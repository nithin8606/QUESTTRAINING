package com.quest.oops.abstraction;

public class ComedyMovie implements Movie {
    private String title;
    private int duration;
    private String director;

    public ComedyMovie(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println("Playing a comedy movie: " + title);
    }

    @Override
    public String getDetails() {
        return "Comedy Movie: " + title + ", Duration: " + duration + " minutes, Directed by: " + director;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}


