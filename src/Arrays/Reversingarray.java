package Arrays;

import java.util.Arrays;

public class Reversingarray {
    public static void main(String[] args) {
        int[] num = {45,75,3,24,65};
        System.out.println(Arrays.toString(num));
        reverse(num,0,3);
        System.out.println(Arrays.toString(num));
    }

    static void reverse(int[] num, int start, int end) {
        while(start<end){
            swap(num,start ,end);
            start++;
            end--;

        }
    }

    static void swap(int[] arr, int a , int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
