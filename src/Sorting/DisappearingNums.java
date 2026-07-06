package Sorting;

//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

public class DisappearingNums {
    public static void main(String[] args) {
        int[] arr= {5,4,9,5,2};
        System.out.println(cyclicSorting(arr));;
    }
    static List<Integer> cyclicSorting(int[] arr){
        int i =0;
        ArrayList<Integer> list=new ArrayList<>();
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length &&arr[i]!=arr[arr[i]-1]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
            list.add(j+1);
            }

        }
        return list;
    }
    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
