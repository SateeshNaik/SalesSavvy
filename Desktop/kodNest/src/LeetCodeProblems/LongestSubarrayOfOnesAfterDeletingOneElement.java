package LeetCodeProblems;

public class LongestSubarrayOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int max=0;
        int zerosCount=0;
        for(right=0; right<nums.length;right++){
            if(nums[right]==0){
                zerosCount++;
            }
            while (zerosCount>1){
                if(nums[left]==0){
                    zerosCount--;
                }
                left++;
            }
            max = Math.max(max,right-left);
        }
        return max;

    }
}
