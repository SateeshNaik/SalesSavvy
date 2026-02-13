import java.util.Scanner;

public class PowerCaluclate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        System.out.println(power(base,exponent));

    }
    public static int power(int base, int exponent){
        int i=0;
        int result=1;
        while(i<exponent){
            result*=base;
            i++;
        }
        return result;
    }
}
