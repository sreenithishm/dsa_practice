package Math;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(Sqrt(40));
    }
    static double Sqrt(double n){
    double x = n;
    double NewGuess;
    while (true){
        NewGuess=(x+(n/x))/2;
        if(Math.abs(NewGuess-x)<0.000000001){
            break;
        }
        x=NewGuess;
    }
    return NewGuess;
}}
