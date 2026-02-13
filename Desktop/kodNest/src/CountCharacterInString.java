public class CountCharacterInString {
    public static void main(String[] args) {

        System.out.println(count("abcaabcaabaabcaacba"));
    }


    public static int count(String str){
        int n=10;
        int count=0;
        for(int i=0; i<n;i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
