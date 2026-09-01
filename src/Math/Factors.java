package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
     factor2(36);
    }

    static void factor(int n) {
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }else{
                System.out.println(i);
                System.out.println(n/i);
            }}
        }
    }
    static void factor2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }else{
                    System.out.println(i);
                    list.add(n/i);
                }}
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
