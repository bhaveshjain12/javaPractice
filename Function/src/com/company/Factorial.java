package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int f= in.nextInt();
        int fact=1;
        for(int i=1;i<=f;i++){

            //for(int j=i;j<f-1;j++) {
                fact = fact * i;
            //}

        }

        System.out.println(fact);

    }
}
