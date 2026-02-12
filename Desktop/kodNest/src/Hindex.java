import java.util.Arrays;
import java.util.Scanner;

public class Hindex {
    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{25,8,5,33}));

    }
    public static int hIndex(int[] arr) {
        Arrays.sort(arr);
        int k=0;
        int index=0;
        for(int i=arr.length-1; i>0; i--){
            if(arr[i]>index){
                k++;
            }
            index++;
        }
        return k;

    }
}
