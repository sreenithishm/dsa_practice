import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previousa = 0;
        int currentb = 1;
        int count = 2;
        while(n>count){
            int temp = currentb;
            currentb=previousa+currentb;
            previousa=temp;
            count++;

        }
        System.out.println(currentb);
    }
}