package com.company;

import java.util.Scanner;

public class Sumofnumbertillzero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            System.out.println("Enter a number");
            int b= in.nextInt();
            if(b!=0) {
                sum = sum + b;
                System.out.println(sum);
            }
            else{
                System.out.println("you enter zero");
                break;
            }

        }
    }
}
