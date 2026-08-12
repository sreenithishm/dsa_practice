package BitManipulation;

public class countingsetbits {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(countingSetbits2(n));
    }
    static int countingSetbits2(int n) {
        int count = 0;
        while (n > 0) {
            n=n-(n&-n);
            count++;
        }
        return count;
    }

    static int countingSetbits1(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    static int countingSetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}