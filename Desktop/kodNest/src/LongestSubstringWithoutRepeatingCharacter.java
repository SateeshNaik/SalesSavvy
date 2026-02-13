public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String temp="";
            for(int j=i; j<str.length(); j++)
            if (temp.indexOf(str.charAt(j))==-1) {
                temp += str.charAt(j);
            } else {
                break;
            }
            if(temp.length()>result.length()){
                result+=temp;

            }
        }
        System.out.println(result.length());

    }
}
