import java.util.Scanner;

public class FindGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int Gcd = fgcd(a, b);
            int Lcm = (a * b) / Gcd;
            System.out.println(Gcd + " " + Lcm);
        }
    }


public static int fgcd(int a, int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
