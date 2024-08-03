package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={18,12,9,14,77,50};
        //IntStream ab=Arrays.stream(arr).sorted();
        int target=50;
        int ans=linearScarch(arr ,target);
        System.out.println(ans);
    }

    static int linearScarch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] == target ){
//                System.out.println("True");
//               return i;
//            }
//        }
        for(int ele:arr){
            if(ele==target){
                System.out.println("true");
                return ele;
            }
        }
        return -1;
    }
}
