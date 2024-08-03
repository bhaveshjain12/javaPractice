package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
//        int a=in.nextInt();
//        int b= in.nextInt();
//
//        int sun=a+b;
//        System.out.println(sun);
        int ans=addition();
        System.out.println(ans);

    }
    public static int addition(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b= in.nextInt();

        int sun=a+b;
        return sun;
    }
}
