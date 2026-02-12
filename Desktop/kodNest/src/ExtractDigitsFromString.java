public class ExtractDigitsFromString {
    public static void main(String[] args) {
        String str="abc123xyz456";
        System.out.println(str.replaceAll("\\D",""));


    }
}
