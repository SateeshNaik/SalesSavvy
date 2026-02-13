public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String str="pwwkewgshvsxhshvhsv";
        System.out.println(longestCheck(str));
    }
    public static int longestCheck(String str){
        String longestString="";

        for(int i=0; i<str.length(); i++) {
            String temp="";
            for (int j = i; j < str.length(); j++) {
                if(temp.indexOf(str.charAt(j))==-1){
                    temp+=str.charAt(j);
                } else {
                    break;
                }
            }
            if(temp.length()>longestString.length()){
                longestString=temp;
            }
        }
        return longestString.length();
    }
}
