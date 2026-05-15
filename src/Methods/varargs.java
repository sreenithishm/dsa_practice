package Methods;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        function(65,"Nithish");
    }

    static void function(int a, String...v) {
        System.out.println(Arrays.toString(v));
    }
}
