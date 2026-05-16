package LinearSearch;

import java.util.Arrays;

public class str_swap {
    public static void main(String[] args) {
        String name = "Nithish";
        char[] arr = name.toCharArray();
        swap(arr, 0, 6);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
