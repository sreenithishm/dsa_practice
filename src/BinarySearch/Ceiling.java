package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {12, 25, 36, 55, 59, 75, 90, 100};
        int target = 51;
        int ans = FindCeiling(arr,target);
        System.out.println(ans);

    }

    static int FindCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (target > arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
            else return mid;

        }
        return start;
    }
}