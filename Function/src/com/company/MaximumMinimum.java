package com.company;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int f=in.nextInt();
        int s=in.nextInt();
        int t=in.nextInt();
        int large= Largest(f,s,t);
        int small=Smallest(f,s,t);

        System.out.println(f+" "+s+" "+t+" "+large);
        System.out.println(f+" "+s+" "+t+" "+small);
    }
    static  int Largest(int f,int s,int t){
        int max=f;
        if(s>max){
            max=s;
        }
        if(t>max){
            max=t;
        }
        return max;
    }
    static  int Smallest(int f,int s,int t){
        int min=f;
        if(s<min){
            min=s;
        }
        if(t<min){
            min=t;
        }
        return min;
    }
}
