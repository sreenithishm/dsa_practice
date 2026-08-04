package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {

    int n =5643543;
    oddoreven(n);
        System.out.println(isodd(n));
}

    static boolean isodd(int n) {
        return (n&1)==1;
    }

    static void oddoreven(int n){
        if((n&1)==1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }

}

