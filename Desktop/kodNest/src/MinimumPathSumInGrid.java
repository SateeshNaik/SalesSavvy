import java.util.Scanner;

public class MinimumPathSumInGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(sum(arr,n,m));
    }
    public static int sum(int[][] arr, int n, int m) {
        int sum = 0;
        int sec=0;
        for (int j = 0; j < m; j++) {
            sum += arr[0][j];
        }

        for (int i = 1; i < n; i++) {
            sum += arr[i][m - 1];
        }

        for (int j = 0; j < m; j++) {
            sec += arr[j][0];
        }
        for (int j = 1; j < m; j++) {
            sec += arr[m-1][j];
        }


        return Math.min(sec,sum);
    }
}

