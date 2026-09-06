package Recursion;

public class ReverseNumber {
    static int reverse=0;
    public static void main(String[] args) {
        int n=152664;
        int a =reverse4(n);
        System.out.println(a);

    }
    static int reverse4(int n){
        int answer=n;
        int base =0;
        while (answer!=0){
            base++;
            answer=answer/10;
        }
        return helpfun(n,base);

    }
    static int helpfun(int n,int base){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,base-1)+helpfun(n/10,base-1);
    }

    static int reverse3(int n,int base){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*base+reverse3(n/10,base/10);
    }
    static void reverse1(int n) {
        if(n==0){
            return;
        }
        int rem=n%10;
        reverse=reverse*10+rem;
        reverse1(n/10);
    }
    static void reverse(int n) {
        int reverse=0;
        while (n!=0){
            int rem=n%10;
            n=n/10;
            reverse=reverse*10+rem;

        }
        System.out.println(reverse);
    }
}
