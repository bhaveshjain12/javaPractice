package com.company;

import java.util.Scanner;

public class pattran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int row =1; row <= a*2; row++) {
            for(int col=1;col<=a;col++){
                if(row+col>=a+1 && row-col<=a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}