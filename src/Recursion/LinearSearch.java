package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15,45,7,5,6,95};
        int target= 4;
        System.out.println(Search(arr,target,0));
    }

    static int Search(int[] arr, int target,int index) {
        if(index== arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Search(arr,target,index+1);
    }
}
