package com.quest.oops.abstraction;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Chirp";
    }
    @Override
    public String habitat() {
        return "Trees";
    }
    @Override
    public String diet() {
        return "Omnivorous";
    }
}

