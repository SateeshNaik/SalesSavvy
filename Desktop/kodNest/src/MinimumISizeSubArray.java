public class MinimumISizeSubArray {
    public static void main(String[] args) {
        int target=7;
        int[] nums ={2,3,1,2,4,3};
        System.out.println(subarray(target, nums));
        System.out.println(Integer.MAX_VALUE);
    }
    public static int subarray(int target,int[] nums){
        int sum = 0;
        int size = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                size = Math.min(size, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
