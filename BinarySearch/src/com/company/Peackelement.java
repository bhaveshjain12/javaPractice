package com.company;
//Find in Mountain Array
public class Peackelement {
    public static void main(String[] args) {
        int [] arr={0,1,0};


    }
//    int search(int[] arr, int target){
//
//    }

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
}
