package LeetCodeProblems;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(palin(str));


    }
    public static boolean palin(String str){
        String lower=str.toLowerCase();
        String s1=lower.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb=new StringBuilder(s1);
        String rev= String.valueOf(sb.reverse());
       return s1.equals(rev);
    }
}

