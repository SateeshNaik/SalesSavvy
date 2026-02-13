import java.util.HashMap;
import java.util.Map;

public class MajorityElementsUsingMaps {
    public static void main(String[] args) {
        int[] arr={3,3,4,2,4,4,4};
        System.out.println(majority(arr));
    }

    public static int majority(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);

            }
            if(map.get(arr[i])==3){
                return arr[i];
            }
        }
        return 0;
    }
}
