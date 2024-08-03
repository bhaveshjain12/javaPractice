package com.company;

public class NumerRevers {
    public static void main(String[] args) {
        int n=12345;
        int r=0;
        while(n>0){
            int rev=n%10;
            n=n/10;
            r=r*10+rev;
        }
        System.out.println(r);
    }
}
