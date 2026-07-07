package Sorting;

import java.util.ArrayList;
import java.util.List;

//442. Find All Duplicates in an Array
public class FindingAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findall(arr));
    }

    static List<Integer> findall(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < arr.length) {

            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                list.add(arr[j]);
            }}
    return list;
    }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

        }
    }


