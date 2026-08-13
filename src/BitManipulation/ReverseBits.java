package BitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int a = 43261596;

        System.out.println(reverse(a));
    }

    static public int reverse(int n) {
        int reverse=0;
        for (int i = 0; i < 32; i++) {

            reverse = (reverse << 1) | (n & 1);
            n = n >> 1;
        }
        return reverse;
    }
}