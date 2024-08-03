package com.company;

import java.util.Scanner;

public class AreaodTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int h=in.nextInt();
        double area= (0.5*b)*h;
        System.out.println(area);
    }
}
