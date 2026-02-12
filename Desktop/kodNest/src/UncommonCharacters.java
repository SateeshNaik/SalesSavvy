import java.util.Arrays;

public class UncommonCharacters {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        System.out.println(uncommonChars(s1, s2));
    }

    public static String uncommonChars(String s1, String s2) {
        boolean[] present1 = new boolean[26];
        boolean[] present2 = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            present1[s1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            present2[s2.charAt(i) - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (present1[i] ^ present2[i]) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
