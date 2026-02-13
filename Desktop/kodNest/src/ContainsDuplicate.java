import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,4}));
    }




    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length; i>=0;i--){
            if(nums[i]==nums[i+1]){
                    return true;
                }
            }
        return false;

    }
}
