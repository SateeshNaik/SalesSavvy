import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(nonRepeating(s));

    }
    public static char nonRepeating(String s){
        Map<Character, Integer> map=new HashMap<>();
        for (char ch: s.toCharArray()){
            map.put(ch ,map.getOrDefault(ch, 0) +1);
        }
        for (char ch: s.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return '$';
    }
}
