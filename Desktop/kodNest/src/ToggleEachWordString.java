
import java.util.Scanner;

public class ToggleEachWordString {
    public static void main(String[] args) {
        String str="Java Programming";
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();

        for(String str1:words){
            StringBuilder tooggleWord = new StringBuilder();

            for (int i=0; i<str1.length(); i++){
                char ch=str1.charAt(i);

                if(Character.isUpperCase(ch)){
                    tooggleWord.append(Character.toLowerCase(ch));
                } else {
                    tooggleWord.append(Character.toUpperCase(ch));
                }

            }
            result.append((tooggleWord).append(" "));
        }
        System.out.println(result.toString().trim());
    }
}
