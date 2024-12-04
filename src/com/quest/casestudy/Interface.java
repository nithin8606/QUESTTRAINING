package com.quest.casestudy;

public class Interface implements Interface1, Interface2 {
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void defaultMethod1() {
        Interface1.super.defaultMethod1();
    }
}




