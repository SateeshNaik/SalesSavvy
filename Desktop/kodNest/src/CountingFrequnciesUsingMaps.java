import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingFrequnciesUsingMaps {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,1,2,3,4,4,4,4};
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxCount=0,res=-1;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int keys= entry.getKey();
            int count=entry.getValue();

            if(maxCount<count){
                maxCount=count;
                res=keys;
            }

        }
        System.out.println(res + " time " + maxCount);
    }
}
