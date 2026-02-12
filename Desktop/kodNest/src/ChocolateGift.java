import java.util.Scanner;

public class ChocolateGift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<1; i++){
            int[] arr=new int[3];
            for(int j=0; j<3; j++){
                arr[j]=sc.nextInt();
            }
            for(int k=0; k<3; k++){
                int totalAmount=arr[k]*5 + arr[k+1]*10;
                int buy=totalAmount/arr[arr.length-1];
                System.out.println(buy);
                break;

            }
        }


    }
}
