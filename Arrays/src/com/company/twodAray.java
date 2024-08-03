package com.company;

import java.util.Arrays;

public class twodAray {
    public static void main(String[] args) {
        int [][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=18;
        int [] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }

    static int[] search(int [][]arr,int target){
        for(int r=0;r<arr.length;r++){
            for (int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }


        return new int[]{-1,-1};
    }
    static int Max(int [][]arr){
        int max=Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++){
            for (int c=0;c<arr[r].length;c++){
                if(arr[r][c]>max){
                    max=arr[r][c];
                }
            }
        }


        return max;
    }
}
