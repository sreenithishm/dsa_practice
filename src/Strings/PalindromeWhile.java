package Strings;

public class PalindromeWhile {
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(ispalindrome(str));
    }

    static boolean ispalindrome(String str) {
        if(str==null||str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        int start=0;
        int end = str.length()-1;
        while (start<str.length()){
            if(str.charAt(start)!=str.charAt(end)){
               return false;
            }
            {
                start++;
                end--;
            }
        }
        return true;
    }
}