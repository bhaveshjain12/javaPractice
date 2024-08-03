package com.company;

import java.util.Scanner;

public class distancebtetowpoint {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int x=in.nextInt();
        int x1=in.nextInt();
        int y=in.nextInt();
        int y1=in.nextInt();

        double d= Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
        System.out.println(d);
    }
}
