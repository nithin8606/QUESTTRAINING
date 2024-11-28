package com.quest.oops.test1;

public class Person {
    private String name;
    private int age;
    private String gender;
    private int location;


    public Person(String name, int age, String male, String india) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public int getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "', location='" + location + "'}";
    }
}

