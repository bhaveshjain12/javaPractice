package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=13;
        int start=1,end=4;
        int ans=Search(arr,target,start,end);
        System.out.println(ans);
    }

    static int Search(int[] arr,int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                System.out.println("True");
                return i;
            }
        }
        return -1;
    }
}
