package com.company;

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,15)));
    }
    static  int[] BinarySearchSimple(int[][] matrix,int row,int cstart,int cEnd,int target){
        while (cstart<=cEnd){
            int mid= cstart+(cEnd-cstart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] search(int [][] matrix,int target){
        int row=matrix.length;
        int cols=matrix[0].length-1;

        if(row==1){
            return BinarySearchSimple(matrix,0,0,cols-1,target);
        }
        // run the loop till 2 row are reamingw
        int rStart=0;
        int rEnd=row-1;
        int cMid=cols/2;
        while (rStart< (rEnd -1)){

            int mid= rStart +(rEnd-rStart)/2;

            if(matrix[mid][cMid]==target){

                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]< target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }
        // now we have to rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid]== target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid]== target){
            return  new  int[]{rStart+1,cMid};
        }
        // search in 1 half
        if(target<= matrix[rStart][cMid-1]){
            return BinarySearchSimple(matrix,rStart,0,cMid-1,target);
        }
        // search in 2 half
        if(target>= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return BinarySearchSimple(matrix,rStart,cMid+1,cols-1,target);
        }
        // search in 3 half
        if(target<= matrix[rStart+1][cMid-1]){
            return BinarySearchSimple(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4 half
        else{
            return BinarySearchSimple(matrix,rStart+1,cMid+1,cols-1,target);
        }
        //return new int[]{-1,-1};
    }
}
