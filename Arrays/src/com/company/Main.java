package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=19;

        int[] rollno= new int[500];

        int[] rollno2={23,2,12,3,4,5,53};

        Scanner in=new Scanner(System.in);

        int [][] arr= new int[3][2];

        for(int row=0;row<arr.length;row++){

            for( int col =0; col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
//        for(int row=0;row<arr.length;row++){
//
//            for( int col =0; col<arr[row].length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        for(int row =0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
