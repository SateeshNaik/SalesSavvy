import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("abc","xxz"));
    }
    public static boolean isIsomorphic(String s1,String s2){
        char[] keyArray=new char[s1.length()];
        char[] valueArray=new char[s2.length()];
        char key, value;
        int keyIndex=-1,valueIndex=-1;
        for(int i=0; i<keyArray.length; i++){
             key=s1.charAt(i);
             value=s2.charAt(i);
             keyIndex = checkIfValuePresent(keyArray,key);
             valueIndex=checkIfValuePresent(valueArray,value);
            if(keyIndex!=-1){
                if(valueArray[keyIndex]!=value){
                    return false;
                }
            }
            if(valueIndex!=-1){
                if(keyArray[valueIndex]!=key){
                    return false;
                }
            }

            keyArray[i]=s1.charAt(i);
            valueArray[i]=s2.charAt(i);
        }

        return true;
    }
    public static  int checkIfValuePresent(char[] array,char key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
            return -1;
        }

}
