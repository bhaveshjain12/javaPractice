package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        even(a);
    }
    static void even(int n){
        if(n==0){
            System.out.println("you enter zero");
        }
        else if(n %2 ==0){
            System.out.println("you enter a even number");
        }
        else if( n%2!=0){
            System.out.println("you enter a odd number");
        }
        else{
            System.out.println("you enter zero or incorrect number ");
        }

    }

}
