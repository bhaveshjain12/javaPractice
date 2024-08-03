package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        while(a>0){
            int b=in.nextInt();
            int s=in.nextInt();
            if(b!=0 && s!=0){
                if(b>s){
                    System.out.println("large number is "+b);
                }
                else{
                    System.out.println("large no is"+s);
                }
            }
            else{
                System.out.println("you enter zero");
            }
        }
    }
}
