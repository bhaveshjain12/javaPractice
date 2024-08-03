package com.company;

public class duplicateelementinrotationgArray {
    public static void main(String[] args) {
        int [] arr ={2,9,2,2,2};
        int ans= findPivrotwithduplicate(arr);
        System.out.println(ans);

    }
    static int search(int[] nums, int target) {
        int pivot=  findPivrotwithduplicate(nums);

        //if you did not find a pivot it means the array is not rotated

        if(pivot == -1){
            //just do normal binary search
            return BinarySearch(nums,target,0,nums.length-1);
        }
        //if pivot is found 2 ass sorted arrays
        if(nums[pivot]== target){
            return pivot;
        }
        if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        //if(target>nums[pivot]){
        return BinarySearch(nums,target,pivot+1,nums.length-1);
        // }
    }
    static int BinarySearch(int [] arr,int target,int start,int end){
//        int start=0;
//        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;

            if(target <arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static  int findPivrotwithduplicate(int [] arr){

        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid> start && arr[mid]>arr[mid-1]){
                return mid-1;
            }
//            if(arr[mid]<= arr[start]){
//                end=mid-1;
//            }
//            else {
//                start=mid+1;
////            }
            // if element at middle start are equal then skip yje duplicate
            if(arr[mid]== arr[start] && arr[mid]== arr[end]){
                //skip the duplicate element
                // note what if there element at start and end were the pivot
                // check: if start is pivot
                if(arr[start]> arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end -1 ;
                }
                end--;
            }
            // left side is sorted so pivot be in right
            else if(arr[start]< arr[mid] || arr[start]== arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }
}
