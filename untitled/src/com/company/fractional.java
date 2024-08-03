package com.company;

import java.util.Scanner;

public class fractional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int f=1;
        int a= in.nextInt();
        for(int i=a;i>0;i--){
           f *=i;
        }
        System.out.println(f);
    }
}
