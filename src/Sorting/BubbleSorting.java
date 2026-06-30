package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr) {
        int swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped=0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=1;
                }

            }

        if (swapped==0){
            break;
        }
        }
    }
}
