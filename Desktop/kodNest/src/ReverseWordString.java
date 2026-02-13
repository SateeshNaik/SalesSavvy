import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordString {
    public static void main(String[] args) {
        String str= "java programing";

        StringBuilder sb=new StringBuilder(str);{
            System.out.println(sb.reverse());
        }


//        String[] str1=str.split(" ");
//        for(String s:str1) {
//            char[] carr = s.toCharArray();
//            for (int i = carr.length - 1; i >= 0; i--) {
//                System.out.print(carr[i]+" ");
//            }
//            System.out.print(" ");
//        }

        
    }
}
