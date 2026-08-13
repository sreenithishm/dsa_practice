package BitManipulation;

public class PowerofNum {
    public static void main(String[] args) {
        int n = 3;
        int i =8;
        System.out.println(power(n,i));
    }

    static int power(int base, int exponent) {
        int ans =1;
        while (exponent>0) {
            if ((exponent & 1) != 0) {
                ans = ans * base;
            }
            base = base * base;
            exponent = exponent >> 1;
        }
        return ans;
    }
        }