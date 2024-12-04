package com.quest.casestudy;

interface Interface1 {
    void method1();
    void method2();
    default void defaultMethod1() {
        System.out.println("Interface1");
    }
}

