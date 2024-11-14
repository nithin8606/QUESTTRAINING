package com.quest.practice_vars;

public class methodexample {
    private static final int X=30;
    private static boolean result;

    public static void main(String[] args) {

        methodexample methodexample = new methodexample();
        methodexample.display("hello");
        methodexample.add(2,4);
        System.out.println(result);
    }

    private void display(String str) {
        System.out.println(str);
    }
    private int add(int a, int b) {
        return (a+b);
    }

}
