package LeetCodeProblems;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int valu1 = Integer.MAX_VALUE;
        int valu2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= valu1) {
                valu1 = num;
            } else if (num <= valu2) {
                valu2 = num;
            } else {
                return true;
            }
        }
        return false;
    }

}
