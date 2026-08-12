package BitManipulation;

public class FindIfpower2 {
    public static void main(String[] args) {
        int n =0;
        System.out.println(find2(n));
    }
    static boolean find2(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count == 1;
    }
    static boolean find(int n ){
        if(n>0&&(n&n-1)==0){
            return true;
        }
        return false;
    }
}
