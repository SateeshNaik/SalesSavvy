import java.util.Scanner;

public class TripleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();

        String fstr1 = str1.replaceAll("[aeiouAEIOU]", "%");
        String fstr2 = str2.replaceAll("[^aeiouAEIOU]", "#");
        String fstr3 = str3.toUpperCase();

        String result=fstr1 + fstr2 + fstr3;
        System.out.println(result);
    }
}
