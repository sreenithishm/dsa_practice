import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius ");
        float cel = sc.nextFloat();
        float fer = (cel*9/5)+32;
        System.out.println("Fahrenheit is "+fer);
    }
}
