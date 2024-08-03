package com.company;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();

        for(int i=a;i<b;i++){
            int x=i;
            int n=0;
            while(x !=0){
                x/=10;
                ++n;
            }
            x=i;
            int power=0;
            while( x!=0){
                int digit= x%10;
                power += Math.pow(digit,n);
                x/=10;
            }
            if(power == i){
                System.out.println(i);
            }
        }
    }
}
