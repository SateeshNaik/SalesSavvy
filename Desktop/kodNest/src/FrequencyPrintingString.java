import java.util.HashMap;
import java.util.Map;

public class FrequencyPrintingString {
    public static void main(String[] args) {
    String str="a2b2c3";
    count(str);
    }
    public static void count(String str){
       Map<Character, Integer> map =new HashMap<>();
       for(int i=0; i<str.length(); i++){
           char ch=str.charAt(i);
           if(Character.isLetter(ch)){
               if(i+1 <str.length() && Character.isDigit(str.charAt(i+1))){
                   int freq=Character.getNumericValue(str.charAt(i+1));
                   map.put(ch,freq);
               }
           }
       }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char key= entry.getKey();
            int value= entry.getValue();
            for(int i=0; i<value; i++){
                System.out.print(key);
            }
        }
    }
}
