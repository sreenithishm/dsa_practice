package BitManipulation;

public class SetithBit {
    public static void main(String[] args) {
        int n = 256;
        int bit =6;
        System.out.println(Find(n,bit));
    }
    static int Find(int  n , int bit){
     return(n|(1<<(bit-1)));

    }
}
