public class LongestCommonPrefix {
    public static void main(String[] args) {
         System.out.println(longest(new String[]{"flower","flow","flight"}));

    }
    public static String longest(String[] str) {
        String firstString=str[0];
        String prefix="";
        int beginIndex = 0;
        for(int i=1; i<firstString.length(); i++){
            int endIndex = i;
            prefix=firstString.substring(beginIndex,endIndex);
            for(int j=1; j<str.length; j++){
                int position=str[j].indexOf(prefix,beginIndex);
                if(position>0 || position==-1){
                    prefix=prefix.substring(0,prefix.length()-1);
                    return prefix;
                }
            }
        }
        return prefix;
    }
}
