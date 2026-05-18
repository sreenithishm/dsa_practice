package BinarySearch;

public class OrderAgnostic {
        public static void main(String[] args) {
            int[] arr ={1,2,5,9,10,16,18,20,35,80,158};
            int[] nums ={99,88,77,44,22,18,10,2,0};
            int target =18;
            int a = Binary(arr,target);
            int b = Binary(nums,target);
            System.out.println(a);
            System.out.println(b);
        }

        static int Binary(int[]arr,int target) {
            int start=0;
            int end = arr.length-1;
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
    }


