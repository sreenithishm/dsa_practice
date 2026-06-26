package BinarySearch;

public class ShipPackages {
    public static void main(String[] args) {
        int[]arr= {1,2,3,1,1};
        int days=4;
        System.out.println(ShipPackages(arr,days));
    }
    static int ShipPackages(int[]weights,int days){
                int start = 0;
                for (int i = 0; i < weights.length; i++) {
                    start=Math.max(start,weights[i]);
                }
                int end=0;
                for (int i = 0; i < weights.length; i++) {
                    end=end+weights[i];
                }
                while (start<end){
                    int mid=start+(end-start)/2;
                    int sum=0;
                    int weight=1;
                    for(int num:weights) {
                        if (mid < sum + num) {
                            sum = num;
                            weight++;
                        } else sum = sum + num;
                    }


                    if(weight>days){
                        start=mid+1;
                    }
                    else end=mid;
                }
                return end;
            }
        }

