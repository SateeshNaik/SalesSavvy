import java.util.HashSet;
import java.util.Set;

public class MagicalSubStringFinder {
    public static void main(String[] args) {

        String s = "abcdef";
        int k = 4;
        System.out.println(isMagical(s,k));
    }
    public static boolean isMagical(String s, int k) {
        if (k > s.length()) return false;
        Set<Character> set=new HashSet<>();
        int left=0;
        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            if(set.size()==k){
                return true;
            }
            System.out.println(set);
        }
        return false;
    }
}
