package com.company;

public class kthsmallest {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int l = 0, r = 5;
        int ans = kthSmallest(arr, k);
        System.out.println(ans);
    }

    public static int kthSmallest(int[] arr,int k) {
        //Your code here
        int temp = 0;
        int ab[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            ab[i] = arr[i];
        }
        int c= ab[k-1];

        return c;
    }
}
