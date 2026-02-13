import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KThElelemt {
    public static void main(String[] args) {
        int[] nums={7,7,10,4,3,3,20,15};
        System.out.println(kthSmallest(nums,3));

    }
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Map<Integer , Integer> treeMap = new TreeMap<>();
        int index =1;
        for(int val : arr){
            if(treeMap.get(val)!=null)
                treeMap.put(val,treeMap.get(val)+1);
            else
                treeMap.put(val,1);
        }
        System.out.println(treeMap);
        for(Integer ele : treeMap.keySet()){
            if(index==k)
                return ele;
            index++;
        }

        return 0;
    }
}
