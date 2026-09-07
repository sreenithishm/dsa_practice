package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int n = 1477441;
        System.out.println(Pali(str));
    }
    static boolean pali2(String str){
        return helper(str,0,str.length()-1);

    }

    static boolean helper(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return helper(str,start+1,end-1);
    }

    static boolean pali1(int n){
        return n==reverse4(n);
    }
    static boolean Pali(String str) {
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start =str.charAt(i);
            char end =str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
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
}
