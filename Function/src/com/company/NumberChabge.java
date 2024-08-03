package com.company;

import java.util.Scanner;

public class NumberChabge {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        Swap(a,b);
        System.out.println(a + " 2 number "+b);

        String chacha ="jain";
        changeName(chacha);
        System.out.println("2number "+chacha);

    }

    static void changeName(String n) {
        n="Bhavesh jain";
        System.out.println(n);
    }

    static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " "+b);
    }
}
