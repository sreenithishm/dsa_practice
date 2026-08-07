package BitManipulation;

public class FindithBit {
    public static void main(String[] args) {
        int n = 158;
        int bit =6;
        System.out.println(Find(n,bit));
    }
    static int Find(int  n , int bit){
        if((n&(1<<(bit-1)))!=0){
            return 1;
        }
        return 0;
    }
}
