public class MinimumCoinsForChange {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int target=11;
        System.out.println(coins(arr,target));
    }
    public static int coins(int[] arr,int target){
        if(target<1)
            return 0;
        int[] minCoin=new int[target+1];
        for(int i=1; i<=target; i++){
            minCoin[i]=Integer.MAX_VALUE;
            for (int coin:arr){
                if (coin<=i && minCoin[i-coin] != Integer.MAX_VALUE){
                    minCoin[i]=Math.min(minCoin[i], 1+minCoin[i-coin]);
                }
            }

        }
        if (minCoin[target]==Integer.MAX_VALUE){
            return -1;
        }
        return minCoin[target];
    }
}
