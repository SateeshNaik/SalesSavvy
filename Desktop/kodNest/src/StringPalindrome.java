import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String=");
        String str=sc.nextLine();
        char[] carArray=str.toCharArray();
        String rev="";
        for(int i=carArray.length-1; i>=0; i--){
            rev+=carArray[i];
        }
        if(str.equals(rev)) {
            System.out.println("it is palindrome=" + rev);
        }
        else {
            System.out.println("It is not palindrome=");
        }
    }
}
