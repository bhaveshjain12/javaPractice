package com.company;

public class Searchinstrings
{
    public static void main(String[] args) {
        String name="Bhavesh";
        char target='a';
        System.out.println(seacrch2(name,target));
    }

    static boolean seacrch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    static boolean seacrch2(String str,char target){
        if(str.length()==0){
            return false;
        }
            for(char ch: str.toCharArray()){
                if(ch == target){
                    return true;
                }
        }
        return false;
    }
}
