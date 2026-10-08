package ArrayStringManipulation;

public class FindtheSecondLargestElement {
    public static void main(String[] args) {
        int[] arr ={20, 5, 10, 8, 15};
        SecondLargest(arr);
    }

    static void SecondLargest(int[] arr) {
        if(arr.length<=1){
            return;
        }
        int Largest =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> Largest){
                Largest =arr[i];
            }
        }
        int SecondLargest =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>SecondLargest&&arr[i]<Largest){
                SecondLargest =arr[i];
            }
        }

        System.out.println(SecondLargest);
    }

}
