package com.company;

public class duplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i=0;

        while(i<nums.length){
            if(nums[i] != i+1) {
                int correct = nums[i]-1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        // find duplicate number
        return -1;
    }
    static void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
