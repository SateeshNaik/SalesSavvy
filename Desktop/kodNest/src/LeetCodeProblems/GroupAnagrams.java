package LeetCodeProblems;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[]  strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupOfAnagrams((strs)));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        for(int i=0; i< strs.length; i++){
            if (visited[i])
                continue;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            visited[i]=true;
            for(int j=i+1; j< strs.length; j++){
                if(!visited[j] &&isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                    visited[j]=true;
                }
            }
            result.add(list);
            System.out.println(result);

        }
        return result;

    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }


    public static List<List<String>> groupOfAnagrams(String[] strs) {
        Map<String ,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1= Arrays.toString(ch);
            if (map.containsKey(s1)) {
                map.get(s1).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(s1, list);
                System.out.println(map);
            }
        }
        return new ArrayList<>(map.values());
    }

}
