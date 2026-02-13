public class BestTimeToBuyAndSellStockTransitionFee {
    public static void main(String[] args) {
        int[] arr={2,1,4,6};
        int fee=2;
        System.out.println(fee(arr,fee));
    }
    public  static int fee(int[] arr,int fee){
        int buyStack=-arr[0];
        int profit=0;
        for(int i=1; i<arr.length; i++){
            profit=Math.max(profit,buyStack+arr[i]-fee);
            buyStack=Math.max(buyStack,profit-arr[i]);

        }
        return profit;
    }
}
