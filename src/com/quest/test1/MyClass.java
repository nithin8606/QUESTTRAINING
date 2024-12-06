package com.quest.test1;

public class MyClass implements Interface1, Interface2 {
    @Override
    public void methodA() {
        System.out.println("Method A from Interface1");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from Interface2");
    }
}

