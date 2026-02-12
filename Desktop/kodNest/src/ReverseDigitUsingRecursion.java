public class ReverseDigitUsingRecursion {
    public static void main(String[] args) {
        int rereverse=reverse(12345,0);
        System.out.println(rereverse);

    }

    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        return reverse(n / 10, rev);
    }
}
