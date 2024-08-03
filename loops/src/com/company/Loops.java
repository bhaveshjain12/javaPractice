package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int a=in.nextInt();
        //int i=1;
//        while( i<=a){
//            //System.out.println(i);
//            i++;
//
//        }
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=a);
    }
}
