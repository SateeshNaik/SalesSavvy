package LeetCodeProblems;

import java.util.Arrays;

public class FindTheMiddleIndexArray {
    public static void main(String[] args) {
        int[] nums = {2,5};
        System.out.println(findMiddleIndex(nums));
    }

    public static int findMiddleIndex(int[] nums) {
        int[] prefixSum=new  int[nums.length];
        int leftSum =0;
        for(int i=0; i<nums.length;i++){
            leftSum +=nums[i];
            prefixSum[i]= leftSum;
        }
        int[] suffixSum=new int[nums.length];
        int rightSum=0;
        for(int i=nums.length-1; i>=0; i--){
            rightSum+=nums[i];
            suffixSum[i]=rightSum;
        }

        for(int i=0; i<nums.length; i++){
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }
        return -1;

    }
}
