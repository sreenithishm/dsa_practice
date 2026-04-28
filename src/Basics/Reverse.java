public class Reverse {
    public static void main(String[] args) {
        int n =98765;
        int answer =0;
        while(n>0){
            int rem =n%10;
            n/=10;
            answer=answer*10+rem;
        }
        System.out.println(answer);
    }

}
