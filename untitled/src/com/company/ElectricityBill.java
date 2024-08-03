package com.company;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();
        int b=1;
        if(a>=1 && a<=100){
            b=a*10;
            System.out.println(b);
        }
        else if(a>100 && a<=200){
            b=a*15;
            System.out.println(b);
        }
        else if(a>200 && a<=300){
            b=a*20;
            System.out.println(b);
        }
        else if(a>300 && a<=400){
            b=a*25;
            System.out.println(b);
        }
        else{
            System.out.println("bijali bachaoo");
        }
    }
}
