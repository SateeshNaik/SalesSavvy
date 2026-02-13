import java.util.Scanner;

public class ReverseASentence {
    public static void main(String[] args) {


        System.out.println( reverse("wireless mouse"));
    }
    public static  String reverse(String str) {

        return str.replaceAll("(?i)[aeiou]", "*");
        }
    }


