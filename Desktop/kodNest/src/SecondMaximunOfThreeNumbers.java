import java.util.Arrays;
import java.util.Scanner;

public class SecondMaximunOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int[] arr=new int[3];
            for(int j=0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int result=arr[arr.length-1];
            int lastElement=arr[arr.length-1];
            for(int k=arr.length-2; k>=0; k--){
                if(arr[k]<lastElement){
                    result=arr[k];
                    break;
                }
            }
            System.out.println(result);
        }
    }
    }

