package com.quest.oops.inheritance;
public class SoftwareProject extends Project {
    private String programmingLanguage;
    public SoftwareProject(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

