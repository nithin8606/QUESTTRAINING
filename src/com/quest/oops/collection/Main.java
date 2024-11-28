package com.quest.oops.collection;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Person> personList = new LinkedList<>();


        Person person1 = new Person("Alice", 25, "Female", "New York");
        Person person2 = new Person("Bob", 30, "Male", "California");

        personList.add(person1);
        personList.add(person2);


        Person clonedPerson = person1.clone();
        if (clonedPerson != null) {
            clonedPerson = new Person(clonedPerson.getName(), clonedPerson.getAge() + 1, clonedPerson.getGender(), "Texas");
            personList.add(clonedPerson);
        }


        System.out.println("Persons in the LinkedList:");
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.remove(person2);
        System.out.println("\nAfter removing Bob:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

