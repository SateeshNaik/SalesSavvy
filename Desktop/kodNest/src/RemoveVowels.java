public class RemoveVowels {
    public static void main(String[] args) {
        String str="Amazing";
        String result = str.replaceAll("[^AEIOUaeiou]", "");
        System.out.println(result);
    }
}
