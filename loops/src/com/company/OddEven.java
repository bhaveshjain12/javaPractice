package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        if(a%2==0){
            System.out.println("even number");
        }
        else if(a==0){
            System.out.println(" you type zero");
        }
        else{
            System.out.println("its a odd number baby");
        }
    }
}
