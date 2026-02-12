import java.lang.reflect.Array;
import java.util.*;

public class DetermineIfTwoStringAreClose {
    public static void main(String[] args) {

        String s1="cabbba";
        String s2="abbccc";
        System.out.println(check(s1,s2));


    }
    public static boolean check(String s1,String s2){
        Map<Character, Integer> map1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);

    }


}
