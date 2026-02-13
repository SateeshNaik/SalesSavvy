class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
    }
    public  static String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        String firstString=strs[0];
        String prefix=firstString;
        for(int i=0; i<firstString.length();i++){
            prefix=firstString.substring(0,i+1);
            for(int j=1; j<strs.length; j++){
                if(strs[j].indexOf(prefix)==-1 || strs[j].indexOf(prefix)>0){
                    return prefix.substring(0,prefix.length()-1);
                }
            }
        }
        return prefix;

    }
}