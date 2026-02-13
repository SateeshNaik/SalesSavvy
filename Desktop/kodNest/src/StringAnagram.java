import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringAnagram {
    public static void main(String[] args) {

       String str1="listen";
       String str2="silent";
       char[] car1=str1.toCharArray();
       char[] car2=str2.toCharArray();
        Arrays.sort(car1);
        Arrays.sort(car2);
         boolean result=Arrays.equals(car1,car2);
        if(result){
            System.out.println("It is a anagram String");
        }else {
            System.out.println("it is not a anagram number");
        }

    }
}

