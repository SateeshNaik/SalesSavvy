import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(matrix(arr));
    }
    public static List<Integer> matrix(int[][] arr){
        List<Integer> list=new ArrayList<>();
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

       while (top<=bottom && left <=right){
           for (int i = left; i <= right; i++) {
               list.add(arr[top][i]);

           }
           top++;
           for(int i=top; i<=bottom; i++){
               list.add(arr[i][right]);

           }
           right--;
           if(top <= bottom) {
               for (int i = right; i >= left; i--) {
                   list.add(arr[bottom][i]);
               }
               bottom--;
           }

           
       }
        return list;
    }
}

