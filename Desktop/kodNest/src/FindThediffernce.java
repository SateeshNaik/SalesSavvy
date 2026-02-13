public class FindThediffernce {
    public static void main(String[] args) {
        System.out.println(difference("a","aa"));

    }


    public static char difference (String s,String t){
        int tASCIISum=0;
        int sASCIISum=0;
        for(int i=0; i<t.length();i++){
            tASCIISum += t.charAt(i);
        }
        for(int i=0; i<s.length();i++){
            sASCIISum += s.charAt(i);
        }

        return (char) (tASCIISum-sASCIISum);

    }
}
