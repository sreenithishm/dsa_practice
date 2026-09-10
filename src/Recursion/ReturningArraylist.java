package Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class ReturningArraylist {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,4,5,6,3,3};
        ArrayList<Integer> list =new ArrayList<>();
        int[] nums = new int[3];
       // System.out.println(FindAll1(arr,14,0));
        System.out.println(FindAll1(arr,3,0));
    }

    //inefficient way by creating a Arraylist for each recursive call
    static ArrayList<Integer> FindAll1(int[] arr,int target,int i) {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ans= FindAll1(arr,target,i+1);
        list.addAll(ans);
        return list;
    }

    //finding multiple targets using a static arraylist variable
    static ArrayList<Integer> FindAll(int[] arr,int target,int i,ArrayList<Integer> list) {
        if(i>arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        FindAll(arr,target,i+1,list);
        return list;
    }

    //ideal way of finding multiple targets using arraylist
    static int[] FindAll(int[] arr,int target,int i,int[] ans,int count) {
        if(i>arr.length-1){
            return ans;
        }
        if(arr[i]==target){
            ans[count]=i;
            return FindAll(arr,target,i+1,ans,count+1);
        }
        return FindAll(arr,target,i+1,ans,count);
    }
}
