package LeetCodeProblems;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 4;
        int[] nums = {1,4,4};
        System.out.println(minSubArrayLen(target, nums));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int sum=0;
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];

                while (sum>=target) {
                minLength =Math.min(minLength, right - left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0: minLength;

    }
}
