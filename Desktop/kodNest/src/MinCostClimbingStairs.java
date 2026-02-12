public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost={3};
        System.out.println(minCost(cost));
    }
    public static int minCost(int[] cost){
        int n=cost.length;
        int[] minCost=new int[n+1];
        for(int i=2; i<=n; i++){
            minCost[i]=Math.min(cost[i-1] +minCost[i-1], cost[i-2] +minCost[i-2]);
        }
      return minCost[n];
    }
}
