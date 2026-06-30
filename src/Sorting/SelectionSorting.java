package Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
        ;
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = 0;
            for (int j = max; j <= last; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }}

                if (arr[max] > arr[last]) {
                    int temp = arr[max];
                    arr[max] = arr[last];
                    arr[last] = temp;
                }

        }

//    static void swap(int[] arr,int first, int second) {
//        int temp =arr[max];
//        arr[max]=arr[last];
//        arr[last]=temp;
//
//    }

//    static int maximum(int[] arr,int start,int end) {
//        int max=start;
//        for (int j = start; j <= end; j++) {
//            if(arr[j]>arr[max]){
//                max=j;
//            }
//
//        }
//        return max;
//    }
    }
}