package LeetCodeProblems;

import java.util.*;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
       int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

       Set<Integer> set=new HashSet<>();
        for(int count:map.values()){
            if(!set.add(count)){
                System.out.println(set);
                return false;
            }
        }
        return true;
    }


}
