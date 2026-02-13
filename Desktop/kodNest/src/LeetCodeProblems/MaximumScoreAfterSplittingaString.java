package LeetCodeProblems;

public class MaximumScoreAfterSplittingaString {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            result=Math.max(countChar(left, '0') + countChar(right,'1' ),result);


        }
        return result;
    }

    public static int countChar(String s,char c){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}
