package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class concate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int[] arr =new int[3];
        System.out.println(arr.length);
        int [] p= new int[arr.length*2];
        System.out.println(p.length);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            p[i]=arr[i];
            p[i+3]=arr[i];

            System.out.print(p[i] +" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(p));

    }
}
