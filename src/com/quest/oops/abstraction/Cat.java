package com.quest.oops.abstraction;
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Meow";
    }
    @Override
    public String habitat() {
        return "Domestic";
    }
    @Override
    public String diet() {
        return "Carnivorous";
    }
}
