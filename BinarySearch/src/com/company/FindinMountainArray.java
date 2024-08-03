package com.company;

public class FindinMountainArray {
    public static void main(String[] args) {

    }
    int search(int [] arr, int target){
        int peak=ans(arr);
        int firstTry=orderAgonstic(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        return orderAgonstic(arr, target , peak+1 ,arr.length-1);
    }
    static int ans(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start< end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you ar in dec part of array
                //this  may be the ans but look at left
                //this is why end !=mid-1
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                //you are in asc part of array
                //we know that mid+1 element >mid element
                start=mid+1;

            }
            //in the end start==end pointing to the largest number beacause of the 2 check
            //start and end are always trying to find max element in the above 2 check
            // hence when they are pointing to just one element that is the max one because
            else {
                return mid;
            }
        }


        return start;
    }
    static int orderAgonstic(int[] arr,int target,int start,int end){
//        int start= 0;
//        int end= arr.length-1;
        // fid array is assending or decending
        boolean asse;
        if(arr[start]<arr[end]){
            asse= true;
        }else
        {
            asse= false;
        }

        while(start<= end){
            int mid= start+ (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(asse) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
