package com.quest.oops.abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String sound();
    public abstract String habitat();
    public abstract String diet();

    @Override
    public String toString() {
        return "Animal Name: " + getName() +
                ", Sound: " + sound() +
                ", Habitat: " + habitat() +
                ", Diet: " + diet();
    }
}
