import java.util.Arrays;
import java.util.Scanner;

public class FindingTheSmallestMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={-1,0,5,7,3,2,4};

        System.out.println(missing(arr));
    }
    public static int missing(int[] arr){
        int num=1;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                num++;
            } else if(arr[i]>num) {
                return num;
            }

        }
        return -1;
    }

}
