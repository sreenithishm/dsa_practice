package BinarySearch;

public class FindTarget {
    public static void main(String[] args) {
    int[] arr ={1,2,5,9,10,16,18,20,35,80,158};
    int target =159;
    int a =    Binary(arr,target);
        System.out.println(a);
    }

    static int Binary(int[]arr,int target) {
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end =mid-1;

            }
            else{
                start=mid+1;
            }
        }


        return -1;
    }
}
