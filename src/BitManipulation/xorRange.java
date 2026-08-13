package BitManipulation;

public class xorRange {
    public static void main(String[] args) {
        int a= 22;
        int b= 458757;
        System.out.println(FindRange(a,b));
    }
    static int FindRange(int a, int b) {
        return xor(b) ^ xor(a - 1);
    }
        static int xor(int a) {
            if (a % 4 == 0){
                return a;
            }
            if (a % 4 == 1) {
                return 1;
            }
            if (a % 4 == 2){
                return a + 1;
            }
            return 0;
        }
    }

