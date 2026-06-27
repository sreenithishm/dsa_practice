package BinarySearch2D;

import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr={{18,9,12},
                {36,-4,91},
                {44,33,16}};
        int target=91;
        System.out.println((search(arr,target)));

    }

    static boolean search(int[][] arr,int target) {
        int row =0;
        int col =arr[0].length-1;
        while (row<arr.length&&col>=0){
            if(arr[row][col]==target){
                return true;
            } else if (arr[row][col]<target) {
                row++;
            }else col--;
        }
        return false;
            }
    }

