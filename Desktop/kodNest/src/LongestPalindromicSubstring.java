import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(palindrome(str));
    }

    public static String palindrome(String str) {
        String longestPalindrome = "";
        for (int i= 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String subString = str.substring(i, j + 1);
                if (isPalindrome(subString)) {
                    if (subString.length() > longestPalindrome.length()) {
                        longestPalindrome = subString;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
