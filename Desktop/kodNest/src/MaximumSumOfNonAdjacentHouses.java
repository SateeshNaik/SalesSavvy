public class MaximumSumOfNonAdjacentHouses {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 10};
        System.out.println(robber(arr));


    }
    private static int robber(int[] arr){
        int prev1=0;
        int prev2=0;
        for(int num:arr){
            int current=Math.max(prev1,prev2+num);
            prev2=prev1;
            prev1=current;
        }

        return prev1;

    }
}
