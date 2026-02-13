package LeetCodeProblems;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
       int[] nums = {-1};
       int k =1;
        System.out.println(findMaxAverage1(nums,k));
    }

    public static double findMaxAverage1(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
