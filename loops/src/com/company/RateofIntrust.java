package com.company;

import java.util.Scanner;

public class RateofIntrust {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int p=in.nextInt();
        int t=in.nextInt();
        int  r=in.nextInt();
        System.out.println((p*t*r)/100);
    }
}
