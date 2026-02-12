public class palindromeInteger {
    public static void main(String[] args) {
        int x=121;
        System.out.println(palindrome(x));

    }
    public static boolean palindrome(int x){
        int rem;
        int reverse=0;
        while(x!=0){
            rem= x%10;
           reverse=reverse*10 +rem;
            x=x/10;
        }
        return x==reverse;

    }

}
