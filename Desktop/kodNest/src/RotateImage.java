import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<a/2; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][a-1-j];
                arr[i][a-1-j]=temp;
                System.out.println(arr[i][j]);

            }
        }




        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
