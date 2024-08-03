package com.company;

public class Search {
    public static void main(String[] args) {
        int arr[]= {2,4,6,9,11,12,14,20,36,48};
        int target=48;
        int ans=binaerySearch(arr,target);
        System.out.println(ans);

    }
    // return the index
    //return -1 if not exit
    static int binaerySearch(int [] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            //int mid = (start+end)/2; // might be possile that start+ end exide the range of interger
            int mid =start+ (end-start)/2;

            if(target < arr[mid]){
                end= mid-1;
            }else if(target> arr[mid]){
                 start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
