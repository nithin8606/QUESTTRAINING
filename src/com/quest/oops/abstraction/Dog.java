package com.quest.oops.abstraction;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Bark";
    }
    @Override
    public String habitat() {
        return "Domestic";
    }
    @Override
    public String diet() {
        return "Omnivorous";
    }
}
