import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOcuureneces {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int num:map.values()){
            if(!set.add(num)){
                return false;
            }
        }
        return true;

    }
}
