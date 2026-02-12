package LeetCodeProblems;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        for(int i=1; i<s.length();i++){
            if(s.length()%i!=0){
                continue;
            }
            System.out.println(s.length()%i);
            String subString=s.substring(0,i);
            boolean isrepeated=true;
            for(int j=i; j<s.length(); j+=i){
                if(!s.substring(j,j+i).equals(subString)){
                    isrepeated=false;
                    break;
                }
            }
            if(isrepeated){
                return true;
            }
        }
        return false;
    }
}
