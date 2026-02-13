import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String s="barfoothefoobarman";
        String[] words={"foo", "bar"};
        Arrays.sort(words);

        System.out.println(find(s,words));
    }
    public static List<Integer> findSubstring(String s,String[] words){
        List<Integer> list=new ArrayList<>();
        int length=words.length;
        int wordLength=words[0].length();
        int totalLength=length*wordLength;
        for(int i=0; i<s.length(); i+=length+1){
            String subString=s.substring(i,i+totalLength);
            String[] array = new String[length];
            for (int k= 0; k < s.length(); k ++) {
                array[k] = s.substring(k, k+wordLength);
            }
            Arrays.sort(array);
            if(Arrays.equals(array,words)){
                list.add(i);
                System.out.println(list);
            }



        }
        return list;


    }
    public static List<Integer> find(String s,String[] words){
        List<Integer> list=new ArrayList<>();
        int wordLength=words[0].length();
        int totalLength =wordLength*words.length;
        int i=0;
        String str=s.substring(i, totalLength);
        while (i<s.length()-totalLength){
            boolean found=false;

            for(int j=0; j< words.length; j++) {
                if (str.contains(words[j])){
                    found=true;
                }  else {
                    found=false;
                    break;
                }
            }
            if(found==true){
                list.add(s.indexOf(str));
            }
            i+=wordLength;
            str=s.substring(i,i+totalLength);


        }
        return list;

    }
}
