import static java.lang.Math.max;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(jump(new int[] {2,3,1,0,4}));

    }
    public static boolean jump(int[] nums) {
        int lastPosition= nums.length-1;
        for(int i=nums.length-2; i>=0; i--) {
            if(i + nums[i] >=lastPosition){
                lastPosition=i;
            }

        }
        return lastPosition==0;

    }
}
