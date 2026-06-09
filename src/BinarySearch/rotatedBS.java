package BinarySearch;

public class rotatedBS {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 9, 1, 2, 3, 4};
        int target = 4;
        System.out.println(search(arr, target));

    }

    static int search(int[] arr, int target) {
        int pivot = pivot(arr);
        int first = Binary(arr, target, 0, pivot);
        if (first != -1) {
            return first;
        } else return Binary(arr, target, pivot + 1, arr.length - 1);
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
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return -1;
    }
}