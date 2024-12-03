package com.quest.quest.assessment;

public class Track {
    private String name;
    private double duration;
    private double rating;
    private boolean isFavorite;

    public Track(String name, double duration) {
        this.name = name;
        this.duration = duration;
        this.rating = 0;
        this.isFavorite = false;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void toggleFavorite() {
        this.isFavorite = !this.isFavorite;
    }

    @Override
    public String toString() {
        return name + " (" + duration + " mins, Rating: " + rating + ", Favorite: " + (isFavorite ? "Yes" : "No") + ")";
    }
}
