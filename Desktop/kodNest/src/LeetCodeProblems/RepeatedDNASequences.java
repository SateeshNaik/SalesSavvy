package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result=new ArrayList<>();
        Map<String ,Integer>  freqMap=new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if (i + 10 <=s.length()) {
                String s1 = s.substring(i, i + 10);
                   if(freqMap.get(s1)!=null){
                       freqMap.put(s1, freqMap.getOrDefault(s1, 0)+1);
                   } else {
                       freqMap.put(s1,1);
                   }
            }
        }
        for(Map.Entry<String, Integer> entry:freqMap.entrySet()){
            String key=entry.getKey();
            int value= entry.getValue();
            if(value>=2) {
                result.add(key);

            }
        }

        return result;

    }
}
