import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualsRowsAndColumnPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(checking(arr,n));
    }

    public static int checking(int[][] arr,int n) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            String str= Arrays.toString(arr[i]);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int count=0;
        for(int j=0; j<n; j++){
            int[] col=new int[n];
            for(int i=0; i<n; i++){
                col[i]=arr[i][j];
            }
            String key=Arrays.toString(col);
           count+=map.getOrDefault(key,0);
        }
        return count;

    }
}
