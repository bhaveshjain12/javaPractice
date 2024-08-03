package com.company;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int m=in.nextInt();
        Mark(m);
    }

     static void Mark(int num) {
             if (num > 91 && num <= 100){
                 System.out.println("AA");
             }
             else if(num > 81 && num <= 90){
                 System.out.println("AB");
             }
             else if (num > 71 && num <= 80) {
                 System.out.println("BB");
             }
             else if (num > 61 && num <= 70){
                 System.out.println("BC");
             }
             else if (num > 51 && num <= 60){
                 System.out.println("CC");
             }
             else if(num > 41 && num <=50){
                 System.out.println("DD");
             }
             else{
                 System.out.println("blank");
             }
         }
     }

