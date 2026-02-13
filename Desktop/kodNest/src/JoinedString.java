import java.util.Scanner;

public class JoinedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        char c=sc.next().charAt(0);

        String[] s=str.split(" ");
       for(String word:s){
           System.out.println(word);
        }
       String joined=String.join(String.valueOf(c),s);
        System.out.println(joined);
    }
}
