public class BuyStackAndSellStack
{
    public static void main(String[] args) {

        System.out.println(stack(new int[]{7,1,5,3,6,4}));

    }

    public static int stack(int[] prices){
       int buyPrice =prices[0];
        int max_Profit = 0;
        for(int i=1; i<prices.length; i++){
            int currentprofit = prices[i]-buyPrice;
            if(currentprofit>max_Profit){
                max_Profit=currentprofit;
            }
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
        }
        return max_Profit;

    }
}
