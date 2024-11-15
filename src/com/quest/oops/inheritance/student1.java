package com.quest.oops.inheritance;

public class student1 extends person {
    private String schoolname;

    public student1(String name, int age, String schoolname) {
        super(name, age);
        this.schoolname = schoolname;

    }
    public void person() {
        System.out.println("study student" );

    }
    public void nameDisplay() {
        super.nameDisplay();
        System.out.println("i study at "+ this.schoolname);
    }
}
