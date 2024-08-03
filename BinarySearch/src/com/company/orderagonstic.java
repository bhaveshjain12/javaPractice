package com.company;

public class orderagonstic {
    public static void main(String[] args) {
        int target= 3;
        int [] arr= {29,23,13,11,9,8,6,4,3,1};
        int ans=sourt(arr,target);
        System.out.println(ans);
    }
    static int sourt(int[] arr,int target){
        int start= 0;
        int end= arr.length-1;
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
