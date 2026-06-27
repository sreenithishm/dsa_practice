package BinarySearch2D;

import java.util.Arrays;

public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                        {4, 5, 6},
                         {7, 8, 9}};
        int target = 1;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int start=0;
        int end=arr.length*arr[0].length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            int c=mid/arr[0].length;
            int r=mid%arr[0].length;

        if(target==arr[c][r]){
            return new int[]{c,r};
        } else if (target>arr[c][r]) {
            start=mid+1;
        }else end=mid-1;

        }
        return new int[]{-1,-1};

    }
}
