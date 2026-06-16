package LinearSearch;

public class sqrtOfxLinear {
    public static void main(String[] args) {
        int x=25;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x){
                int ans = 0;

                for (int i = 1; (long)i * i <= x; i++) {
                    ans = i;
                }

                return ans;
            }
        }


