package com.company;

public class splitArraySumInMiniRange {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end +=nums[i];
        }

        while(start<end){

            int mid = start+(end-start)/2;

            // calculate how may pieces you can divided this is with the ma sum

            int sum=0;
            int pieces =1;

            for(int i:nums){
                if(sum +i >mid){
                    // you cannot add thi subarray ,make new one
                    //say you add this num in new subarray, then sum =num

                    sum= i;
                    pieces++;
                }
                else{
                    sum +=i;
                }
            }
            if(pieces>k){
                start =mid +1;
            }
            else{
                end=mid;
            }


        }
        return start;
    }
}
