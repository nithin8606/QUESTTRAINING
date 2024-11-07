package com.quest.practice_vars;

public class PracticeVars {
    static final int VOTE_AGE = 20;

    public static void main(String[] args) {
        int age = 20;
        double salary = 1000.00;
        char gender = 'M';
        String firstname = "nithin";
        String lastname = "krishna";

        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);

        age = 23;
        System.out.println("age = " + age);
        System.out.println("vote age = =" + VOTE_AGE);
//        VOTE_AGE=23; it cannot be change because VOTE_AGE is final

        stringConcatenation();
        practiceConversion();
        stringMethods();
    }

    private static void practiceConversion() {
        int a = 20;
        double b = 10.5;
        double sum = a + b;
        int round = (int) b;
        System.out.println("sum = " + sum);
        System.out.println("round = " + round);
    }

    private static void stringConcatenation() {
        String s1 = "nithin";
        String s2 = "krishna";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        int age = 20;
        System.out.println("name =" + s3 + "age =" + age);
    }
    private static void stringMethods()
    {
        String s1="John";
        String s2="JOHN";
        String s4=new String("hello world");
        String s3=new String("hello world");
        System.out.println(s3.length());
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s4==s3);
    }


}

