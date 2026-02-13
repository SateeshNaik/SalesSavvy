public class BuyStackAndSellStackKodnest1 {
    public static void main(String[] args) {
        System.out.println(buySell(new int[] {7,1,5,3,6,4}));

    }

    public static int buySell(int[] prices) {
        int buyPrice = prices[0];
        int totalProfit =0;
        for (int i = 1; i < prices.length; i++) {
            int profit=prices[i]-buyPrice;
            if( profit>0) {
                totalProfit += profit;
            }
            if(profit!=0) {
                buyPrice = prices[i];

            }

        }
        return totalProfit;
    }
}
