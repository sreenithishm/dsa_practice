package LinearSearch;

public class Range_search {
    public static void main(String[] args) {
        int[] num = {45,6,4,8,5,45,458};
        int target = 8;
        int a =findinRange(num,target,1,5);
        System.out.println(a);
    }

    static int findinRange(int[] arr , int target , int a , int b) {
        if(arr.length==0){
            return -1;
        }
        for (int i = a; i <=b ; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }


}
