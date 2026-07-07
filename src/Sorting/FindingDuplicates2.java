package Sorting;
//287. Find the Duplicate Number
public class FindingDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 2, 2, 1};

        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i]!=i+1){
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                return arr[i];
            }}else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return arr[j];
            }
        }
    return -1;
    }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }
    }

