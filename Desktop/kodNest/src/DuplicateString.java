import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String=");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        str.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);

    }
}
