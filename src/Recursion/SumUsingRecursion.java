package Recursion;

public class SumUsingRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum1(n));
        Sum(n);
    }
    static int Sum1(int n){
        if(n==1){
            return 1;
        }
        return n*Sum1(n-1);
    }
    static void Sum(int n){
        int ans=1;
        for (int i = 1; i<= n; i++) {
            ans=ans+i;
        }
        System.out.println(ans);
    }
}
