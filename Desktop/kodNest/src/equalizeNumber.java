import java.util.Scanner;

public class equalizeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (equalize(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean equalize(int a,int b){
        while (a%2==0){
            a=a/2;
        }
        while (b%2==0){
            b=b/2;
        }
        return a==b;
    }
}