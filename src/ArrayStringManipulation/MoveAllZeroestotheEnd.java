package ArrayStringManipulation;

import java.util.Arrays;

public class MoveAllZeroestotheEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        movingZeros(arr);
    }

    static void movingZeros(int[] arr) {
        int avail=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,i,avail);
                avail++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void MovingZeros1(int[] arr){
        int[] nums =new int[arr.length];
        int answer =0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=0) {
               nums[answer] = arr[i];
               answer++;
           }
        }
        System.out.println(Arrays.toString(nums));
     }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}