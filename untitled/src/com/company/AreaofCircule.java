package com.company;

import java.util.Scanner;

public class AreaofCircule {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int r= in.nextInt();
        double area= 3.14*r*r;
        System.out.println(area);
    }
}
