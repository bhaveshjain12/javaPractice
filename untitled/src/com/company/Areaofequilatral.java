package com.company;

import java.util.Scanner;

public class Areaofequilatral {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();

        double area=(Math.sqrt(3)/4)*(a*a);
        System.out.println(area);
    }
}
