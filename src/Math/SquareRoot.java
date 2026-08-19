package Math;

public class SquareRoot {
    public static void main(String[] args) {
        int n =40;
        int p =3;
        System.out.printf("%.2f",squareroot(n,p));
    }
    static double squareroot(int n,int p){
        int start =0;
        int end=n;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (n == mid * mid) {
                return mid;
            } else if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double ans =end;
        double increment =0.1;
        for (int i = 0; i < p; i++) {
            while (ans*ans<=n){
            ans=ans+increment;
            }
            ans =ans- increment;
            increment =increment / 10;
        }

        return ans;
    }

    static int square(int n) {
        for (int i = 0; i<n ; i++) {
            if(i*i>n){
                return i-1;
            }
        }
        return n;
    }

}
