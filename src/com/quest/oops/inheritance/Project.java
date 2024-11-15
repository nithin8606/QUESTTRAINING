package com.quest.oops.inheritance;
public class Project {
    protected String name;
    public Project(String name) {
        this.name = name;
    }
    public void displayDetails() {
        System.out.println("Project Name: " + name);
    }
}

