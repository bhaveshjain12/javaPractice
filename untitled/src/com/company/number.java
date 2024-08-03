package com.company;

public class number {
    public static void main(String[] args) {


        int a = 234,d,p=1,s=0;
        for(int i=0;i<=a;i++) {
            d = a % 10;
            p = p * d;
            s=s+d;
            a=a/10;
        }
        System.out.println(p);
        System.out.println(s);
        System.out.println(p-s);
    }
}
