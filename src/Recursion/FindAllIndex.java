package Recursion;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] arr ={15,68,14,14,66,25,58,14};
        FindAll(arr,14,0);
        System.out.println(list);
    }
    static ArrayList<Integer>  list = new ArrayList<>();
    static void FindAll(int[] arr,int target,int i) {
        if(i>arr.length-1){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        FindAll(arr,target,i+1);
    }
}
