package Recursion;

public class PatternsUsingRecursion {
    public static void main(String[] args) {
        int n = 4;
//        triangle
        triangle(n,0);
    }static void triangle(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){

            triangle(row,col+1);
            System.out.print("*");
        }
        else {
            triangle(row-1,0);
            System.out.println();
        }

    }
    static void inverted2(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            inverted2(row,col+1);
        }
        else {
            System.out.println();
            inverted2(row-1,0);
        }

    }
    static void inverted(int row, int col, int n){
        if(row==n){
            return;
        }
        if(col<n-row){
            System.out.print("*");
            inverted(row,col+1,n);
        }
        else {
            System.out.println();
            inverted(row+1,0,n);
        }

    }
}
