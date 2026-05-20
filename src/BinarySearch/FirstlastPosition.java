package BinarySearch;

import java.util.Arrays;
//34. Find First and Last Position of Element in Sorted Array
public class FirstlastPosition {
    public static void main(String[] args) {
        int[] arr={2,4,4,4,4,5,6,9,10};
        int target = 4;
        int[] ans =searchRange(arr,target);
        System.out.println(Arrays.toString(ans));

    }
        static int[] searchRange(int[] nums, int target) {
            return new int[] {firstnum(nums,target),lastnum(nums,target)};

        }
        static int firstnum(int[] nums,int target){
            int start =0;
            int end = nums.length-1;
            int ans =-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    ans=mid;
                    end=mid-1;
                }
                else if (nums[mid]<target){
                    start=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            return ans;
        }
        static int lastnum(int[] nums,int target){
            int start =0;
            int end = nums.length-1;
            int ans =-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    ans=mid;
                    start=mid+1;
                }
                else if (nums[mid]<target){
                    start=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            return ans;
        }
    }

