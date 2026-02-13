

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindingAmicablePairsAndTheirSum {
    public static void main(String[] args) {
        int n=2000;
        int i=1;
        int result=0;

        while (i<n) {
            int[] arr=amicable(i);
            result += arr[0]; // result += amicable(i)[0]
            i++;
        }
        System.out.println(result);

    }
    public static int[] amicable(int a) {
        int b = 0;
        int bsum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                b += i;
            }
        }
        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                bsum += i;
            }
        }
        if(a==bsum && a!=b)
            return new int[] {a,bsum};
        else
            return new int[]{0,0};

    }

}
