package Arrays;

public class maximum {
    public static void main(String[] args) {
    int[] arr = {56,76,334,23,7889,334};
    int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[]arr) {
        int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){                         //compare using arr[i] using loop
                max=arr[i];
            }

        }
        return max;
    }
}
