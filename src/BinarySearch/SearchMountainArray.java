package BinarySearch;

public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,4,3,2,1};
        int target =5;
        System.out.println(search(arr,target));

    }
    static int peak(int[] arr) {
        int start =0;
        int end =arr.length-1;
        while (start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }

        }
        return start;
    }
    static int Binary(int[]arr,int target,int start,int end) {
        boolean ascending = arr[start]<arr[end];
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(ascending){
                if(arr[mid]>target){
                    end =mid-1;

                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(arr[mid]<target){
                    end =mid-1;

                }
                else{
                    start=mid+1;
                }
            }}


        return -1;
    }
    static int search(int[] arr,int target){
        int peak =peak(arr);
        int first=Binary(arr,target,0,peak);
        if (first!=-1){
            return first;
        }
        else return Binary(arr,target,peak+1,arr.length-1);


    }
}
