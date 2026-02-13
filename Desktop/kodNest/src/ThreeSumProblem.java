import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        //System.out.println( threeSum(nums));
        System.out.println(sum(nums));
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
               for (int k = j + 1; k < nums.length; k++) {
                   if (nums[i] + nums[j] + nums[k] == 0) {
                       List<Integer> list1=new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        result.add(list1);

                    }
                }
            }
        }
        return new ArrayList<>(result);
   }
   public static List<List<Integer>> sum(int[] nums){
        Arrays.sort(nums);
       Set<List<Integer>> result = new HashSet<>();
       for(int i=0; i<nums.length-2; i++){
           int left=i+1;
           int right=nums.length-1;
           while (left<right){
               int sum=nums[i]+nums[left]+nums[right];
               if (sum==0){
                   List<Integer> list1=new ArrayList<>();
                   list1.add(nums[i]);
                   list1.add(nums[left]);
                   list1.add(nums[right]);
                   result.add(list1);
                   left++;
                   right--;
               } else if(sum<0) {
                   left++;
               } else {
                   right --;
               }
           }
       }
       return new ArrayList<>(result);

   }
}
