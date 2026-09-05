package Recursion;

public class ProductOfDIgits {
    public static void main (String[] args){
        int n =121;
        System.out.println(product2(n));
    }
    static int product2(int n){
        if(n%10==1){
            n=n/10;
        }
        if(n%10==0){
            return 1;
        }
        return n%10* product2(n/10);

    }
    static int product1(int n){
        if(n==0){
            return 1;
        }
        return n%10* product1(n/10);

    }
    static int product(int n){
        int max=1;
        int digit;
        while (n!=0){
            digit=n%10;
            max=max*digit;
            n=n/10;
        }
        return max;
    }
}
