package com.quest.test1;


public class MainPerson {
    public static void main(String[] args) {
        Object phone1 = new Object();
        Object phone2 = new Object();

        PersonA personA = new PersonA(phone1, phone2);
        PersonB personB = new PersonB(phone1, phone2);

        personA.start();
        personB.start();
    }
}

