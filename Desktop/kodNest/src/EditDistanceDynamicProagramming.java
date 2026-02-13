public class EditDistanceDynamicProagramming {
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";
        System.out.println(minDistance(s1,s2));

    }
    public static int minDistance(String s1,String s2){
        int m=s1.length();
        int n =s2.length();
        int[][] costDp=new int[m+1][n +1];

        for(int i=1; i<=m; i++){
            costDp[i][0]=i;
        }
        for(int j = 1; j<= n; j++){
            costDp[0][j]=j;
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    costDp[i][j]=costDp[i-1][j-1];
                } else {
                    int topLeft=costDp[i-1][j-1];
                    int top=costDp[i-1][j];
                    int left=costDp[i][j-1];
                    costDp[i][j]=Math.min(topLeft, Math.min(top,left))+1;
                }
            }
        }
        return costDp[m][n];

    }
}
