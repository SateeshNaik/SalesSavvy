package LeetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (prefixSumMap.containsKey(currentSum - k)) {
              count+=prefixSumMap.get(currentSum-k);
            }
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

                System.out.println(prefixSumMap);


        }
        return count;
    }
}



