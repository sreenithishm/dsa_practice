package BinarySearch;

public class KokoEating {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};/*Output: 4*/
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
    static int minEatingSpeed(int[] piles, int h){
        int start=1;
        int end=0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
                //    Math.max(piles[i],end);
            }}
            while (start < end) {
                int mid = start + (end - start) / 2;
                int hours = 0;
                for (int pile : piles) {
                    hours =hours+ (pile + mid - 1) / mid;
                }
                if (hours > h) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
        }
        return end;

    }}