package Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class ReturningArraylist {
    public static void main(String[] args) {
        int[] arr ={15,68,14,14,66,25,58,14};
        ArrayList<Integer> list =new ArrayList<>();
        int[] nums = new int[3];
        System.out.println(FindAll1(arr,14,0));
        System.out.println(Arrays.toString(FindAll(arr,14,0,nums,0)));
    }
    static ArrayList<Integer> FindAll1(int[] arr,int target,int i) {
        ArrayList<Integer> list=new ArrayList<>();
        if(i>arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ans= FindAll1(arr,target,i+1);
        list.addAll(ans);
        return list;
    }
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
