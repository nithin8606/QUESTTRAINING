package com.quest.oops.collection;


import java.util.*;

public class TestMain {
    public static void main(String[] args) {

        Student s1 = new Student(105, "Alice", 20);
        Student s2 = new Student(106, "Bob", 22);
        Student s3 = new Student(102, "Charlie", 19);
        Student s4 = new Student(104, "David", 23);


        TreeSet<Student> studentTreeSetById = new TreeSet<>(Comparator.comparingInt(Student::getId));

        studentTreeSetById.add(s1);
        studentTreeSetById.add(s2);
        studentTreeSetById.add(s3);
        studentTreeSetById.add(s4);

        System.out.println("Sorted Students by ID using TreeSet:");
        studentTreeSetById.forEach(System.out::println);


    }
}

