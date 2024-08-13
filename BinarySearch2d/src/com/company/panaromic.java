package com.company;

public class panaromic {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean a= checkIfPangram(sentence);
        System.out.println(a);
    }
    static boolean checkIfPangram(String sentence) {

        int arr[]=new int[26];

        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<1)
                return false;
        }

        return true;
    }
}
