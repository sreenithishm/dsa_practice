package Recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
        factori(n);
    }
    static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    static void factori(int n){
        int ans=1;
        for (int i = 1; i<= n; i++) {
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
