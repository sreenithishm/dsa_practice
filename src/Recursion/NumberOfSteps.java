package Recursion;
//1342. Number of Steps to Reduce a Number to Zero
public class NumberOfSteps {
    public static void main(String[] args) {
        int n = 4445;
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if ((num & 1) == 0) {
            return helper(num / 2, count + 1);
        } else if ((num & 1) != 0) {
            return helper(num - 1, count + 1);
        }
        return count;
    }
}
