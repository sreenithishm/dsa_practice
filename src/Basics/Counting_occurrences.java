public class Counting_occurrences {
    public static void main(String[] args) {
        int n = 436383573;
        int target =3;
        int count =0;
        while(n>0){
            int temp = n%10;
            if(temp== target){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
