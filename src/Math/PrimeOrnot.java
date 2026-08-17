package Math;

public class PrimeOrnot {
    public static void main(String[] args) {
        int n = 35;
        for (int i = 0; i <n ; i++) {
        System.out.println(i+" "+prime(i));
    }}

    static boolean prime(int a) {
        if(a<2){
            return false;
        }
        for (int i = 2; i*i<=a; i++) {
            if(a%i==0){
                return false;
            }
        }
            return true;
        }
}
