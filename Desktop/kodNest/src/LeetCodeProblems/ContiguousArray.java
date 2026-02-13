package LeetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContiguousArray {
    public static void main(String[] args) {
       int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));

    }
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count+=-1;
            } else {
                count+=1;
            }
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
                System.out.println(map);
            }
        }
        return maxLen;
    }
}
