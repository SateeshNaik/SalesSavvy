public class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(jump2(new int[]{2,3,1,1,4}));
    }

    public static int jump2(int[] nums) {
        int jump=0;
        int currentEnd=0;
        int farthest=0;

      for(int i=0; i<nums.length-1; i++) {
          farthest=Math.max(farthest,i+nums[i]);
          if(i==currentEnd){
              jump++;
              currentEnd=farthest;
          }

      }
      return  jump;

    }
}

