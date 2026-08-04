package BitManipulation;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr ={5,5,45,21,21,6,45,5,6,689,4,4};
        System.out.println(Duplicate2(arr));
    }
    static int Duplicate2(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
    //Brute Force
    static int Duplicate(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count==1){
                return arr[i];
            }
        }
        return -1;
    }
}
