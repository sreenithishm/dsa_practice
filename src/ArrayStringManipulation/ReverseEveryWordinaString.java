package ArrayStringManipulation;

public class ReverseEveryWordinaString {
    public static void main(String[] args) {
        String str ="I love Java";
        reverse(str);
    }

    static void reverse(String str) {
        StringBuilder str1 =new StringBuilder(str);
        int start=0;
        int end =str1.length()-1;
        for (int i = 0; i <str1.length(); i++) {
        start++;
        end--;
    }
//        return str1;
    }

    }