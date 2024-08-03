package com.company;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int f=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                f=i;
                System.out.println(f);
            }

        }


    }
}
