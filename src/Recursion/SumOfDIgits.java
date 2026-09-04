package Recursion;

public class SumOfDIgits {
    public static void main (String[] args){
        int n =541564;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);

    }
    static int sum1(int n){
        int max=0;
        int digit;
        while (n!=0){
            digit=n%10;
            max=max+digit;
            n=n/10;
        }
        return max;
    }
}
