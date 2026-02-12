public class RemoveDuplicateFromSorted2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{ 1,1,1,2,2,2,3,3}));

    }
    public  static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i-2]  ) {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}

