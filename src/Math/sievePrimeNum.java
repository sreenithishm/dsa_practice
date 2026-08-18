package Math;

public class sievePrimeNum {
    public static void main(String[] args) {
        int n =40;
        boolean[] arr={true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,};
        prime(arr,n);
    }

    static void prime(boolean[] arr, int n) {
        for (int i = 2; i*i <=n ; i++) {
            if(arr[i]){
                for (int j = i*i; j <=n ; j=j+i) {
                    arr[j]=false;
                }

            }}
            for (int j = 2; j <=n ; j++) {
        if (arr[j]){
            System.out.println(j);
        }}
    }
}
