package com.company;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
    int []arr={3,1,5,4,2};
    selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int []arr){
        for(int i=0;i<arr.length;i++) {
            //find the max  item in thr remaing array and swap the correct index
            int last = arr.length - i - 1;
            int maxInde = getMaxIndex(arr, 0, last);
            swap(arr,maxInde,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void  swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
