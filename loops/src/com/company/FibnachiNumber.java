package com.company;

import java.util.Scanner;

public class FibnachiNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        for(int i=2;i<=n;i++){
            int  temp =b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
    }
}
