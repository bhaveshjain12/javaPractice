package com.company;

import java.util.Scanner;

public class AreaofRombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        int s=in.nextInt();
        int area=(d*s)/2;
        System.out.println(area);
    }
}
