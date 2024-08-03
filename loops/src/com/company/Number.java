package com.company;

public class Number {
    public static void main(String[] args) {
        int n= 13839;
        int count=0;
        for(int i=0;i<=n;i++){
            int rem = n%10;
            n=n/10;
            if(rem == 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
