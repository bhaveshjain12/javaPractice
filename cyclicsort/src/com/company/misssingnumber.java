package com.company;

import java.util.ArrayList;
import java.util.List;

public class misssingnumber {
    public static void main(String[] args) {

    }
        public List<Integer> findDisappearedNumbers(int[] nums) {

        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] < nums.length && nums[i]!=nums[correct]){
                Swap(nums,i,correct);
            }
            else {
                i++;z
            }
        }
        //just find missing numbers
            List<Integer> ans= new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }



        return ans;
        }
        static void Swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }

}
