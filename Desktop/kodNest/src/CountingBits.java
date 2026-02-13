import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= 5;
        System.out.println(Arrays.toString(bits(a)));
    }
    public static int[] bits(int a){
        int[] arr=new int[a+1];
        arr[0]=0;
        for(int i=1; i<=a; i++) {
            int count = 0;
            int n=i;
            while (n>0){
                count+=n%2;
                n=n/2;
            }
            arr[i]=count;

        }
       return arr;
    }
}
