package Methods;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if(Find(i)){
                System.out.println(i);
            }

        }
//        boolean n = Find(153);
//        System.out.println(n);
    }

    static boolean Find(int a) {
        int og = a;
        int sum =0;
        while (a>0){
            int rem = a%10;
            a=a/10;
            sum = sum+rem*rem*rem;

        }
        if(sum==og){
            return true;
        }
        else return false;

    }

}
