package LinearSearch;

public class arraysearch {
    public static void main(String[] args) {

    int[] arr = {54,65,45,458,56,5,47};
    int target = 4;
    int ans =find(arr,target);
        System.out.println(ans);
}

    static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;

            }


        }
        return 58;

    }
}
