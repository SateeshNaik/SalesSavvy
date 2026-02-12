import java.util.Scanner;

public class SumOfFloating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        int n = (int) f;
        int result=0;

        while(n>0){
            int rem=n%10;
            result+=rem;
            n=n/10;


        }
        System.out.println(result);

    }
}
