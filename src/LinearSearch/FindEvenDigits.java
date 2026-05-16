package LinearSearch;
//1295. Find Numbers with Even Number of Digits
public class FindEvenDigits {
    public static void main(String[] args) {
    int[] arr ={12,345,2,6,7896};
    int count = findNumbers(arr);
        System.out.println(count);
    }

    static int findNumbers(int[] arr) {
    int count =0;
        for (int num : arr) {
            if(even(num)){
                count++;
            }

        }
    return count;
    }

     static boolean even(int num) {
        int count = 0;
         while(num>0){
             num = num/10;
             count++;

         }
         if(count%2==0){
             return true;
         }
    return false;
    }

}