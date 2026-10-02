package Recursion;

public class SearchRotatedArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1};
        System.out.println(search2(arr,1,0,arr.length));
    }
    static int search2(int[] arr,int target,int start,int end){
        if (start > end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        //base condition
        if(arr[mid]==target){
            return mid;
        }

        //left sorted
        if(arr[start]<=arr[mid]) {
            if (arr[mid] > target && arr[start] <= target) {
                return search2(arr, target, start, mid - 1);
            }
            else {
                return search2(arr, target, mid + 1, end);
            }}
                //right sorted

            else {
            if (arr[mid] < target && arr[end] >= target) {
                return search2(arr, target, mid+1, end);
            }
            else {
                return search2(arr, target, start, mid-1);
            }}
        }



    private static int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            //left
            else if(arr[start]<arr[mid]){
                if(arr[mid]>target&&arr[start]<=target){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            //right
            else{
                if(arr[mid]<target&&arr[end]>=target){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
        }
    }
        return -1;
}
}