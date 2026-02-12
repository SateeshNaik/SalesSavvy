package LeetCodeProblems;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
      int[]  nums = {2,5};
      int target = 2;
        //System.out.println(search(nums,target));
        int[]  nums1= {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println(search(nums1,target1));
    }
    public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid =(left+right/2);
        while (left<=right){
            int midValue=nums[mid];
            if(midValue==target){
                return mid;
            } else if(midValue>target){
                right=mid-1;
                mid=(left+right)/2;

            } else {
                left=mid+1;
                mid=(right+left)/2;

            }
        }
        return -1;

    }
}
