package LeetCodeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberNonOverlappingSubarraysWithSumEqualsTarget {
    public static void main(String[] args) {
        int[] nums = {-1,3,5,1,4,2,-9};
        int target =6;
        System.out.println(maxNonOverlapping(nums, target));
    }

    public static int maxNonOverlapping(int[] nums, int target) {
        int sum = 0;
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        for (int num : nums) {
            sum += num;
            if (seen.contains(sum - target)) {
                count++;
                sum = 0;
                seen.clear();
                seen.add(0);
            } else {
                seen.add(sum);
            }
        }
        return count;
    }
}
