package com.company;

import java.util.Locale;

public class palidrom {
    public static void main(String[] args) {
        String a="abccba";
        System.out.println(rev(a));

    }
    static  boolean ispalidrom(String str){
        str= str.toLowerCase(Locale.ROOT);
        for (int i = 0; i <= str.length()/2 ; i++) {
            char start= str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start !=end){
                return false;
            }

        }
        return true;
    }
    static boolean rev(String str){
        str=str.toLowerCase(Locale.ROOT);
        String ab="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ab+=""+str.charAt(i);
        }
        if(ab.equals(str)){
            return true;
        }
        return false;
    }
}
