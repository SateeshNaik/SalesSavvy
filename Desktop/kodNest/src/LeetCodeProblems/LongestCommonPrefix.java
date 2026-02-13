package LeetCodeProblems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","fight"};
        System.out.println(commonPrefix(str));
    }
    public static String commonPrefix(String[] str){
        String firstString=str[0];
        String prefix="";
        for(int i=0; i<firstString.length(); i++){
            prefix=firstString.substring(0,i+1);
            for(int j=1; j<str.length; j++){
                if (!str[j].startsWith(prefix)) {
                    return prefix.substring(0,prefix.length()-1);

                }
            }
        }
        return prefix;
    }
}
