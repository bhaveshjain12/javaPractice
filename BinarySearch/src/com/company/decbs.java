package com.company;

public class decbs {
    public static void main(String[] args) {
        int [] arr= {20,15,14,12,11,10,6,4,3,2,1};
        int target=3;
        int ans=bs(arr, target);
        System.out.println(ans);
    }
    static int bs(int [] arr,int target){
        int start=0;
        int end= arr.length-1;



        while (start<=end){
            int mid= start+ (end-start)/2;

            if(target> arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
