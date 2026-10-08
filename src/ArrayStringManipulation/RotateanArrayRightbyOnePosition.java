package ArrayStringManipulation;

import java.util.Arrays;

public class RotateanArrayRightbyOnePosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Rotate(arr);
        System.out.println();
    }

    static void Rotate(int[] arr) {
        int last =arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}