package com.company;

import java.util.ArrayList;
import java.util.List;

public class allduplicate {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
       // List<Integer> ans=new ArrayList<>();
    int i=0;
    while (i< nums.length) {
        int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
            i++;
        }
    }
        List<Integer> ans= new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
    return ans;
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
