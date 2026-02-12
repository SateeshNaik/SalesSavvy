package LeetCodeProblems;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
    public  static  int rob(int[] nums) {
        int currentMoney=0;
        int prevMoney=0;
        for(int i=0; i<nums.length;i++){
           int MaximumMoney =Math.max(currentMoney,prevMoney+nums[i]);
           prevMoney=currentMoney;
           currentMoney=MaximumMoney;

        }
        return currentMoney;

    }
}
