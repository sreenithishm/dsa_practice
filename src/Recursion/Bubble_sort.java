package Recursion;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubble_recursion1(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_recursion1(int[] arr, int i , int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
        if(arr[j]>arr[j+1]){
            swap(arr,j,j+1);
        }
            bubble_recursion1(arr, i, j + 1);
        } else {

            bubble_recursion1(arr, i - 1, 0);
        }
    }
    static int[] bubble_recursion(int[] arr, int i , int j,boolean swapped){
        if(i==arr.length-1){
            return arr;
        }
        if(j<arr.length){
            if(arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                swapped=true;
            }
            return bubble_recursion(arr,i,j+1,swapped);
        }
        if(!swapped){
            return arr;
        }
        else {
            return bubble_recursion(arr,i+1,1,false);
        }
    }
    static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swapped =false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                    swapped=true;
                }}
                if(!swapped){
                    break;
                }

        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
