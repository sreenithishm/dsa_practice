package Recursion;

public class FindArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr ={10,20,31,41,61,93};
        System.out.println(SortedOrNot2(arr,0));
    }
    static boolean SortedOrNot2(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&SortedOrNot1(arr,index+1);
    }
    static boolean SortedOrNot1(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return SortedOrNot1(arr,index+1);
    }
    static boolean SortedOrNot(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
