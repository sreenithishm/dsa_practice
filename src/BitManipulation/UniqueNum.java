package BitManipulation;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int answer =0;
        for (int i = 0; i < 32; i++) {
            int count =0;
            for (int num:arr){
                if((num&(1<<i))!=0){
                    count++;
                }
            }
            if(count%3!=0){
                answer=answer|(1<<i);
            }

        }
        return answer;
    }

}
