package com.company;

public class Shadowing {
    static int x=10;

    public static void main(String[] args) {
        System.out.println(x);
        int x=40;
        System.out.println(x);
    }
}
