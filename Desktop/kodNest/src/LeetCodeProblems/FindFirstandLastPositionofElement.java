package LeetCodeProblems;

import java.util.Arrays;

public class FindFirstandLastPositionofElement {
    public static void main(String[] args) {
        int[] nums={3,3,3};
        int target=3;
        System.out.println(Arrays.toString(searchRange(nums,target)));

        int[] nums1={5,7,7,8,8,10};
        int target1=8;
        System.out.println(Arrays.toString(searchRange(nums1,target1)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
       for(int i=0; i<nums.length; i++) {
           if (nums[i] == target) {
               if (arr[0] == -1) {
                   arr[0] = i;
               }
               if (i < nums.length - 1 && nums[i + 1] == target) {
                   arr[1] = i + 1;

               } else if (i < nums.length - 1 && nums[i + 1] != target) {
                   arr[1] = i;
               } else {
                   arr[1] = i;
               }
           }
       }
        return arr;
    }
    }


