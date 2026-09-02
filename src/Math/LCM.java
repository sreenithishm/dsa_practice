package Math;

public class LCM {
    public static void main(String[] args) {
        int a =12;
        int b= 18;
        int lcm = hcf(a,b)*a/hcf(a,b)*b/hcf(a,b);  //a*b/hcf(a,b);
        System.out.println(lcm);

    }
    static int hcf(int a , int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
