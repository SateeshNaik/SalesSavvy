package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
       int previousElement=nums[0];
       int count=0;
        for(int i=1; i<nums.length-1; i++){
            if(previousElement<nums[i]){
                count++;
                if(previousElement<nums[i+1]){
                    previousElement=nums[i];
                    previousElement=nums[i+1];
                }
            } else if(previousElement>nums[i] && count>=1){
                continue;
            } else {
                previousElement=nums[i];
            }


        }
        return count+1;

    }
}
