package Methods;

public class Shadowing {
    static int a = 60;

    public static void main(String[] args) {
        System.out.println(a);
        int a = 35;            // shadowing only inside for this block
        System.out.println(a);
        len();                 // still takes input class block method present outside the main method
    }

    static void len() {
        System.out.println(a);
    }
}
