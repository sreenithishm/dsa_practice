package Math;

public class HCF {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        System.out.println(hcf(num1,num2));
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
