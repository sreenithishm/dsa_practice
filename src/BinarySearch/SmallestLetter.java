package BinarySearch;
//744. Find Smallest Letter Greater Than Target
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','a','c','d'};
        char target = 'a';
        char ans = FindCeiling(arr,target);
        System.out.println(ans);

    }

    static char FindCeiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (target >= arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;

            }

        }
        return arr[start%arr.length];
    }
}
