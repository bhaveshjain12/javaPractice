package com.company;

public class StringEAMPLE {
    public static void main(String[] args) {
        String a=greet();
        System.out.println(a);

        String b=muGreet("Bhavesh jain");
        System.out.println(b);
    }

    static String muGreet(String name) {
        String m=name;
        return m;
    }

    static String greet(){
        String greeting= "how are you";
        return greeting;
    }
}
