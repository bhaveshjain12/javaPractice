package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {
        fub(1,2,3,4,5,6,7,8,9);
    }
    static void fub(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
