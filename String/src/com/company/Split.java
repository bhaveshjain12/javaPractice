package com.company;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String text= "bhavesh you can do it your best";

        String []result = text.split(" ");
        System.out.println(Arrays.toString(result));
//        for(String str: result){
//            System.out.println();
//        }
    }
}
