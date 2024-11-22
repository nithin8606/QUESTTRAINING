package com.quest.oops.exceptionhandling;


public class StudentManager implements StudentOperations {

    private Student[] students;
    private int studentCount;

    public StudentManager(int maxSize) {
        students = new Student[maxSize];
        studentCount = 0;
    }

    @Override
    public void addStudent(int id, String name, double grade) {
        if (studentCount >= students.length) {
            throw new IllegalStateException("Cannot add more students. Maximum limit reached.");
        }
        if (id <= 0 || name == null || name.isEmpty() || grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Invalid student details. Please try again.");
        }
        students[studentCount] = new Student(id, name, grade);
        studentCount++;
        System.out.println("Student added successfully!");
    }

    @Override
    public void viewStudent(int id) {
        Student student = null;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                student = students[i];
                break;
            }
        }
        if (student == null) {
            throw new NullPointerException("Student with ID " + id + " not found.");
        }
        System.out.println(student.toString());
    }
    
    public void addStudent(int id, String name, double grade, String thesisTitle) {
        if (studentCount >= students.length) {
            throw new IllegalStateException("Cannot add more students. Maximum limit reached.");
        }
        if (id <= 0 || name == null || name.isEmpty() || grade < 0 || grade > 100 || thesisTitle == null || thesisTitle.isEmpty()) {
            throw new IllegalArgumentException("Invalid student details. Please try again.");
        }
        students[studentCount] = new GraduateStudent(id, name, grade, thesisTitle);
        studentCount++;
        System.out.println("Graduate student added successfully!");
    }
}

