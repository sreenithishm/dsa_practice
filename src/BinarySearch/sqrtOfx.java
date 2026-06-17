package BinarySearch;

public class sqrtOfx {
    public static void main(String[] args) {
        int x=28;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x) {
        int start=1;
        int end=x;
        int ans=0;
        while (start<=end){
            int mid =start+(end-start)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>x){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
        }}

return ans;
    }
}
