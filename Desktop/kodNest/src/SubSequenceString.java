import java.util.Scanner;

public class SubSequenceString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abc";
        String st1="ahbgdc";
        System.out.println(subSequence(str,st1));

    }
    public static  boolean subSequence(String str, String str1){
        int i=0, j=0;
        while ((i<str.length() && j<str1.length())){
            if(str.charAt(i)==str1.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }
        }
        if ((i== str.length())){
            return true;
        }
        return false;
    }

}
