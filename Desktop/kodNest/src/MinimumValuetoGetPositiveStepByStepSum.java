public class MinimumValuetoGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(minStartValue(nums));
    }
    public static int minStartValue(int[] nums) {
        int sum=0;
       int minSum=0;
       int startValue=1;
        for(int s:nums){
            sum+=s;
            minSum=Math.min(minSum, sum);
            startValue=1-minSum;
        }
        return startValue;

    }
}
