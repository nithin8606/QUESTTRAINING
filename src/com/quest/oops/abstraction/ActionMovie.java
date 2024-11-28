package com.quest.oops.abstraction;

public class ActionMovie implements Movie {
    private String title;
    private int duration;
    private String actor;

    public ActionMovie(String title, int duration, String actor) {
        this.title = title;
        this.duration = duration;
        this.actor = actor;
    }

    @Override
    public void play() {
        System.out.println("Playing an action movie: " + title);
    }

    @Override
    public String getDetails() {
        return "Action Movie: " + title + ", Duration: " + duration + " minutes, Lead Actor: " + actor;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}


