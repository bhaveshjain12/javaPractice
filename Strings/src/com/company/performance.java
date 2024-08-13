package com.company;

public class performance {
    public static void main(String[] args) {
        String a="";

        for (int i = 0; i < 26; i++) {
            char ch= (char)('a'+i);
            System.out.println(ch);
            a +=ch;
            System.out.println(a);

        }
    }
}
