import java.util.Scanner;

public class UniquepathWithObstacles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(path(arr,n,m));
    }
    public static int path(int[][] arr,int n,int m){
        if(arr[0][0]==1){
            return 0;
        }
        int[][] dp=new int[n][m];
        dp[0][0]=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==1){
                    dp[i][j]=0;
                } else {
                    if(i>0){
                        dp[i][j]+=dp[i-1][j];
                    }
                    if(j>0){
                        dp[i][j]+=dp[i][j-1];
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        return dp[n-1][m-1];
    }
}
