package LeetCodeProblems;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
        System.out.println(sumOddLengthSubarray(arr));
    }


    public static int sumOddLengthSubarrays(int[] arr) {
        int TotalSum =0;

        for(int i=0;i<arr.length;i++){
            int currentSum =0;
            int count=0;
            for(int j=i;j<arr.length;j++){
                currentSum +=arr[j];
                count++;
                if(count%2!=0){
                    TotalSum += currentSum;
                }

            }

        }
        return TotalSum;

    }

    public static int sumOddLengthSubarray(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int i= 1; i<= n; i += 2) {
            int windowSum = 0;

            for (int j = 0; j < i; j++) {
                windowSum += arr[j];
            }
            totalSum += windowSum;

            for (int j = i; j < n; j++) {
                windowSum += arr[j] - arr[j - i];
                totalSum += windowSum;
            }
        }

        return totalSum;
    }

}
