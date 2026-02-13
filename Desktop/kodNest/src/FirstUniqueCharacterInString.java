public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUnique("swiss"));
    }

    public static char firstUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            // Check if character appears elsewhere
            if (s.indexOf(current) == s.lastIndexOf(current)) {
                return current; // return the first unique character
            }
        }
        return '_'; // return a default character if none found
    }
}

