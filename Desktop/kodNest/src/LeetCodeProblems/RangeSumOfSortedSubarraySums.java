package LeetCodeProblems;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySums {

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        long[] nums = {1,2,3,4};
        int n = 4, left = 1, right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }

    public static int rangeSum(long[] nums, int n, int left, int right) {
        int arrLength = n * (n + 1) / 2;
        long[] arr = new long[arrLength];
        int index = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[index++] = sum;
        }
        for (int i = 1; i < nums.length; i++) {
            long currentSum = 0;
            int s = i;
            while (s < nums.length) {
                currentSum += nums[s];
                arr[index++] = currentSum;
                s++;
            }
        }
        Arrays.sort(arr);
        long totalSum = 0;
        for (int i = left - 1; i < right; i++) {
            totalSum = (totalSum + arr[i]) % MOD;
        }
        return (int) totalSum;
    }
}
