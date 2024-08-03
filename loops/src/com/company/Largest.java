package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c= in.nextInt();

//        if(a<b && b>c){
//            System.out.println(b);
//        }
//        else if(a>b && a>c){
//            System.out.println(a);
//        }
//        else{
//            System.out.println(c);
//        }
        int max= Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
