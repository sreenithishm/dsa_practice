package LinearSearch;

import java.util.Arrays;

public class Search2d {
        public static void main(String[] args) {

            int[][] arr = {{54,65,45},{45,56,5},{54,4,47}};
            int target = 4;
            int[] ans =find(arr,target);
            System.out.println(Arrays.toString(ans));
        }

        static int[] find(int[][] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {


                if(target == arr[i][j]){
                        return new int[]{i,j};

                    }}


            }
            return new int[] {-1,-1};

        }
    }

