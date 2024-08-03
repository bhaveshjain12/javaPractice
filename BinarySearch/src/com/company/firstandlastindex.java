package com.company;

import java.util.Arrays;

public class firstandlastindex {
    public static void main(String[] args) {
        int[]  arr ={5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans=searchRange(arr, target);
        for(int i=0;i<2;i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
       ans[0]= search(nums,target,true);
       if(ans[0] != -1) {
           ans[1]= search(nums, target, false);
       }
        //ans[0]= start;
        //ans[1]=end;
        return  ans;
    }
    static  int search(int[] nums, int target, boolean findstartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid= start+ (end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target> nums[mid]){
                start=mid+1;
            }
            else {
                ans= mid;

                if(findstartIndex ==  true){
                    end= mid-1;
                }
                else{
                    start= mid +1;
                }
            }
        }
        return  ans;
    }
}