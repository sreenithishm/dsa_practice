package BitManipulation;

import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] arr={{1,0,1},
                {0,0,0},
                {1,1,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage1(arr)));
    }
    static int[][] flipAndInvertImage2(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            int start = 0;
            int end = arr[row].length - 1;
            while (start < end) {
                arr[row][start]=arr[row][start]^arr[row][end];
                arr[row][end]=arr[row][end]^arr[row][start];
                arr[row][start]=arr[row][start]^arr[row][end];
                start++;
                end--;
            }
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=arr[row][col]^1;

            }
        }

        return arr;
    }
    static int[][] flipAndInvertImage1(int[][] arr) {
        for (int[] row :arr) {
            for (int col = 0; col < (row.length + 1) / 2; col++) {
                int temp = row[col];
                row[col] = row[row.length - col - 1] ^ 1;
                row[row.length - col - 1] = temp ^ 1;
            }
        }
        return arr;
    }
}
