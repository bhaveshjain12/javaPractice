package com.company;

public class findelementininfinityarray {
    public static void main(String[] args) {
        int [] arr= {2,3,5,6,7,8,10,11,12,15,20,23,30,31};
        int target=15;
        int an= ans(arr,target);
        System.out.println(an);
    }
    static  int ans(int[] arr ,int target){
        //first find the index
        //first start wth a box of size 2
        int start=0;
        int end=1;

        //condition foe the target to lie in the range
        while( target> arr[end]){
            int newStart=end+1;
            //double the box value
            // end= previous end+ sizeofbox*2
            end=end+(end-start +1)*2;
            start= newStart;
        }
        return chunk(arr,target,start,end);
    }

     static int chunk(int[] arr, int target,int start,int end) {
//        int start=arr[0];
//        int end=arr[1];

        while (start<=end){
            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target> arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
