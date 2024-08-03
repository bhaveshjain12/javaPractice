package com.company;

public class findMin {
    public static void main(String[] args) {
        int[] arr={11,21,-211,34,25,3,455,6};

        int ans=Minnumber(arr);
        System.out.println(ans);
    }

    static int Minnumber(int[] arr) {
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
