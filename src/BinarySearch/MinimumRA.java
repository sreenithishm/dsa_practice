package BinarySearch;
//153. Find Minimum in Rotated Sorted Array
public class MinimumRA {
    public static void main(String[] args) {
    int[] arr={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int pivot = pivot(nums);
        return nums[pivot + 1];
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(start<mid&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(end>mid&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else end=mid-1;

        }
        return -1;
    }

}
