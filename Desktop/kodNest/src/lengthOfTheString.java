import java.util.Scanner;

public class lengthOfTheString {
    public static void main(String[] args) {
        System.out.println(check("Hello world"));

    }
    public static int check(String str){
        String str1 = str.trim();
        int count = 0;
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str1.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
