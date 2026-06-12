package BinarySearch;

public class RotatedBSduplicates {
    public static void main(String[] args) {
    int[] arr = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,7,2,2,2};
    int target = 7;
    System.out.println(search(arr, target));

}

    static int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot==-1){
            return Binary(arr,target, 0, arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if (arr[0]>=target){
            return Binary(arr,target,pivot+1,arr.length-1);
        }

        return Binary(arr,target,0,pivot-1);


//        int first = Binary(arr, target, 0, pivot);
//        if (first != -1) {
//            return first;
//        } else return Binary(arr, target, pivot + 1, arr.length - 1);
    }

    static int Binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            {
                if (arr[mid] > target) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }




        }
        return -1;
    }}