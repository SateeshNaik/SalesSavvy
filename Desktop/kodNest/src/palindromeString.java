import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        String reverse=sb.reverse().toString();
        if(reverse.equals(str)){
            System.out.println("it is  a palindrome");
        }else
        {
            System.out.println("it is not a palindrome string");
        }
    }
}
