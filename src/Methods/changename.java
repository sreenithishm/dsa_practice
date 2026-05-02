package Methods;

import java.util.Arrays;

public class changename {
    public static void main(String[] args) {
    int[] n = {3,5,3,5,6};
    change(n);
        System.out.println(Arrays.toString(n));

    }

    static void change(int[] n) {
        n[2] = 8;
    }
}
