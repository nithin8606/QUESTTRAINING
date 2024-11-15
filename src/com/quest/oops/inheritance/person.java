package com.quest.oops.inheritance;

public class person {
    private String name;
    private int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void nameDisplay() {
        String msg = String.format(" student name is %s & age is %d", name, age);
        System.out.println(this.name);
        System.out.println(msg);
    }
}
