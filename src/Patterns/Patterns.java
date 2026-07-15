package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern17(n);
    }
    static void pattern17(int n){
        for (int row = 1; row < 2*n; row++) {

            int c = row > n ? 2 * n-row: row;
            int spaces=n-c;
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int spaces=n-row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void triangle(int n){
        for (int row = 1; row <= n; row++) {
            int spaces=n-row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Diamond(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n-row: row;
            int spaces = n - c;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
        for (int col = 0; col < c; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    }
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();

        }
    }
    static void pattern5(int n){
        for (int i = 1; i <=2* n; i++) {
            int c = i>n ? 2*n-i:i;
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
