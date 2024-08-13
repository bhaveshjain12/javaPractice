package com.company;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr={0,-26,56,18};
        insertionsor(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void  insertionsor(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int [] arr,int s,int e){

            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        
    }
}
