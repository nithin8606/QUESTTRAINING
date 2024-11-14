package com.quest.practice_vars;

public class typecastingeg {

    public static void main(String[] args) {

//        implicit
        int n=5;
        double p=n;
        System.out.println(p);

//        explicit
        double p1=2.3;
        int n1=(int)p1;
        System.out.println(n1);


        int n3=200;
        byte b=(byte)n3;
        System.out.println(b);
    }

}
