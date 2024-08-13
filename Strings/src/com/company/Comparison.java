package com.company;

public class Comparison {
    public static void main(String[] args) {
        String a= new String("Bhavesh");
        String b= new String("Bhavesh");
        System.out.println( a.equals(b));// value check
        System.out.println(a==b);// make heap a differnt obj
        System.out.println(a.charAt(0));
    }
}
