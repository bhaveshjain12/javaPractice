package com.company;

public class setmismatch {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] nums) {
        //int [] arr=new int[nums.length];
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!= index+1){
                return new int[]{nums[index], index+1};
            }

        }

        return new int[]{-1,-1};
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
