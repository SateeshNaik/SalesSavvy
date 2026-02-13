import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr1={1, 6, 2, 10, 3};
        int target=7;
        System.out.println(Arrays.toString(twoSum(arr1,target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int left=0,right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if (sum< target) {
                left++;
            }
            if(sum>target)
                right--;
            if(nums[left]+nums[right]==target){
                arr[0]=left;
                arr[1]=right;
                return arr;
            }

        }
        return arr;
    }
}
