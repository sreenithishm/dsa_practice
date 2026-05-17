package LinearSearch;
//1672. Richest Customer Wealth
public class RichestConsumer {
    public static void main(String[] args) {
        int [][] arr ={{55,45,4},{45,54,21},{47,5,48}};
        int ans =maximumWealth(arr);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum=sum+accounts[person][account];

                
            }
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
    }
}
