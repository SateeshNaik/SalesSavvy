public class LengthOfTheLongestSubString {
    public static void main(String[] args) {
        System.out.println(length("abcabcbb"));

    }
    public static int length(String str){
        String result="";
        for(int i=0; i<str.length();i++){
            String temp="";
            for(int j=i; j<str.length();j++){
                if(temp.indexOf(str.charAt(j)) == -1){
                    temp+=str.charAt(j);

                }else {
                    break;
                }
            }
            if(temp.length()>result.length()){
                result=temp;
            }
        }
        return result.length();
    }
}
