package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String a=in.next();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
            rev.trim();

        }
        if(a.equals(rev)){
            System.out.println("is a palindrome");
        }
    }
}
