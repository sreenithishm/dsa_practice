package BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {10,19,28,49,75,100,101,105};
        int target = 49;
        System.out.println(answer(arr,target));

    }
    static int answer(int[] arr, int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int temp = end+1;
            end=end+(end-start+1)*2;
            start =temp;
        }
        return Find(arr,target,start,end);
    }
    static int Find(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (target > arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
