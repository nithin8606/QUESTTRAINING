package com.quest.oops.exceptionhandling;


public class GraduateStudent extends Student {

    private String thesisTitle;

    public GraduateStudent(int id, String name, double grade, String thesisTitle) {
        super(id, name, grade);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thesis Title: " + thesisTitle;
    }
}


