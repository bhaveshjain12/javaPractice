package com.company;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        eligiable(a);
    }
    static void eligiable(int n){
        if(n>18){
            System.out.println("you can vote");
        }else{
            System.out.println("not vote");
        }
    }
}
