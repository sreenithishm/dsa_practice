package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int count=8;
        fib(0,1,count);


    }
    static void fib(int a,int b,int count){
        if(count ==0){
            return;
        }
        System.out.println(a);
        fib(b,a+b,count-1);
    }


}
