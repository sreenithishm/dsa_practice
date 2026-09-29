package Math;

public class TailingZeros {
    public static void main(String[] args) {
        int n=13;
        System.out.println(Zeros(n));
    }
    static int Zeros(int n){
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        return count;
    }
}
