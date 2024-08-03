package com.company;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int dis=a*b/100;
        int discount= a-dis;
        System.out.println(discount);
    }
}
