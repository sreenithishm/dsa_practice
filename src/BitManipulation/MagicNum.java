package BitManipulation;

public class MagicNum {
    public static void main(String[] args) {
        float n = 2.58f;
        System.out.println((int)n);
    }
    static int count(int n){
        int count =0;
        while (n>0){
        if((n>>1)!=0) {
            count++;
        }
            n=n>>1;
        }
        return count;
    }
    static int count2(int n) {
        int count = 0;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            count++;
        }
        return count;
    }
    static int nthMagic(int n) {
        int ans=0;
        int base=5;
        while (n>0){
            int last =n&1;
            n=n>>1;
            ans =ans+last*base;
            base=base*5;
        }
        return ans;
    }
}
