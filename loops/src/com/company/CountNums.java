package com.company;

public class CountNums {
    public static void main(String[] args) {
        int n=455536;
        int count =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            if(rem==5){
                count++;
            }

        }
        System.out.println(count);
    }
}
