package Arrays;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int[] num = {45,75,3,24,65};
        System.out.println(Arrays.toString(num));
        swap(num,1,2);
        System.out.println(Arrays.toString(num));
    }
    static void swap(int[] arr, int a , int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
