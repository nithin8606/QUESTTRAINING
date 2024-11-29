package com.quest.oops.collection;

public class Person implements Cloneable {
    public int id;
    private String name;
    private int age;
    private String gender;
    private String location;


    public Person(String name, int age, String gender, String location) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "', location='" + location + "'}";
    }
}
