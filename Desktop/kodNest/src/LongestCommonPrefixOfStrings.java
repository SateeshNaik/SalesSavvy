import java.util.Arrays;

public class LongestCommonPrefixOfStrings {
    public static void main(String[] args) {
       // String[] str={"geeksforgeeks","geeks","geek","geezer"};
        System.out.println(longest(new String[]{"geeksforgeeks","geeks","geek","geezer"}));
        //System.out.println(longest(new String[]{"ol","xozic"}));




    }
    public static String longest(String[] arr){
        String firstString=arr[0]; // pick the first string
        String prefix="";  // let prefix is empty
        int beginIndex = 0;
        for(int i=1; i<firstString.length(); i++){ // Iterate till length of  {firstString}
            int endIndex = i;
            prefix=firstString.substring(beginIndex,endIndex);     // pick the suffix from the  {firstString}
            for(int j=1; j<arr.length; j++){       // Iterate from 1 to all the remaining Strings in the arr
                int position=arr[j].indexOf(prefix,beginIndex);
                if(position>0 || position==-1){   // Check If prefix is present in all the remaining strings in the array as prefix
                    prefix=prefix.substring(0,prefix.length()-1);  // update or remove last character from the prefix , ex :  prefix = geek , as "geek"
                                                                   // not present in all the strings. So , we just need to return "gee"
                    return prefix;
                }
            }
        }
        return prefix;
    }



}
