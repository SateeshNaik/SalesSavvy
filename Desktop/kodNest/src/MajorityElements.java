import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr={2,2,3,3,3,3,3,2};

        System.out.println(majorityElement(arr));
    }


    public static int majorityElement(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0; i<nums.length; i++){
          if(map.get(nums[i])==null) {
              map.put(nums[i], 1);
          }else if(map.get(nums[i])!=null){

              map.put(nums[i],map.get(nums[i])+1);
              if(map.get(nums[i]) > nums.length/2)
                  return nums[i];
          }
      }


      return 0;
    }
}
