package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        String fruit= in.next();

        switch (fruit){
            case "Mango" :
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("A sweet red fruits");
                break;
            case "Orange":
                System.out.println("Round fruits");
                break;
            case "Graps":
                System.out.println("small fruits");
            default:
                System.out.println("please enter valid fruits" +
                        "");
        }
    }
}
