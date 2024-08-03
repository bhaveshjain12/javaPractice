package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        float num=input.nextFloat();
//        System.out.println(num);

        int num1 =(int)(65.65f);
        //System.out.println(num1);

        int a =257;
        byte b=(byte) (a);
       // System.out.println(b);

        int number= 'A';
        System.out.println(number);
    }
}
