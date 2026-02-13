import java.util.Scanner;

public class WidthOfThePerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(width(arr,k));

    }

    public static int width(int[] arr, int k){
        int width= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k){
                width=width+1;
            }else {
                width=width+2;
            }
        }
        return width;
    }
}
