package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,12,15,23,35,56,69,75,90,100};
        int target =90;
        int ans = BS(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int BS(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return BS(arr,target,start,mid-1);
        }
        return BS(arr,target,mid+1,end);
    }
}
