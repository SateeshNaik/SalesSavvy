package LeetCodeProblems;

public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        int[] cardPoints = {96,90,41,82,39,74,64,50,30};
        int k = 8;
        System.out.println(maxScore(cardPoints,k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int left = 0;
        int right=cardPoints.length-1;
        int prefixSum =0;
        for(left=0; left<k; left++) {
            prefixSum += cardPoints[left];
        }
            int sum=prefixSum;
        for(int i=k-1; i>=0; i--) {
            prefixSum=prefixSum-cardPoints[i];
            prefixSum=prefixSum+cardPoints[right];
            sum=Math.max(sum, prefixSum);

            right--;
        }
        return sum;

    }
}
