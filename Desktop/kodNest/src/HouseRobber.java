import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

        int[] arr={2,1,1,2,1,2};
        System.out.println(robbing(arr));
    }
    public static int robbing(int[] arr){
        int prev1=0;
        int prev2=0;
        for(int num:arr){
            int current=Math.max(prev1,prev2+num);
            prev2=prev1;
            prev1=current;
        }

        return prev1;
    }
}
