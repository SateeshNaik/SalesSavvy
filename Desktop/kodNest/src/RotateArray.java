import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1,2,3,4,5,6,7} ,3)));

    }

    public static int[] rotateArray(int[] a,int k){
        for(int j=0; j<k; j++){
           int index= a.length-k+j;
           for(int i=index-1; i>=j; i-- ){
               int temp=a[i];
               a[i]=a[index];
               a[index]=temp;
               index--;

           }
        }
        return a;


    }
}
