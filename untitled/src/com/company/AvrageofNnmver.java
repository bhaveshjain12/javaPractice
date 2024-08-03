package com.company;

import java.util.Scanner;

public class AvrageofNnmver {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        double res=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            res=res+a[i];
        }
        System.out.println(res/n);
    }
}
