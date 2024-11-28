package com.quest.oops.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("nk", 25, "Male", "dubai"));
        people.add(new Person("Ak", 30, "Female", "usa"));
        people.add(new Person("Bk", 17, "Male", "uk"));
        people.add(new Person("Ck", 22, "Female", "italy"));
        people.add(new Person("Dk", 19, "Male", "india"));

        System.out.println("People with age above 20:");
        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        System.out.println("\nPeople with age below 20:");
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() < 20) {
                System.out.println(person);
            }
        }
    }
}
