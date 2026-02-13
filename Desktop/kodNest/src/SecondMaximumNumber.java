import java.util.Scanner;

public class SecondMaximumNumber {
    public static void main(String[] args) {
        int large=0;
        Scanner sc = new Scanner(System.in);
        int triples = sc.nextInt();
        for (int i = 0; i < triples; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
             large = Math.max(a, b );
            System.out.println(large);



        }

    }
}
