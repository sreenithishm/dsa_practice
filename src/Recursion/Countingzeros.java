package Recursion;

public class Countingzeros {
    public static void main(String[] args) {

    int n =1006502050;
    count(n);
        System.out.println(count2(n,0));
}
    static int count2(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return count2(n/10,count+1);
        }

        return count2(n/10,count);
    }
    static int count1(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        if(rem==0){
           return  1+count1(n/10);
        }

        return count1(n/10);
    }

    static void count(int n) {
        int count =0;
       while (n!=0){
            int rem=n%10;
            if(rem==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
