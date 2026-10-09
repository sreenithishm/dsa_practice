package Strings;
//125. Valid Palindrome
public class ValidPalindrome {
    public static void main(String[] args) {
        String str="mala  yalam**";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
                    }
                }
                return true;
            }
        }


