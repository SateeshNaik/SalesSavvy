import java.util.Arrays;

public class MovingzerosAtTheEnd {
    public static void main(String[] args) {
        int[]  nums={0,0,1,3,12};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j; i<nums.length; i++){
                nums[j]=0;
                j++;
        }
            System.out.println(Arrays.toString(nums));

    }

}


