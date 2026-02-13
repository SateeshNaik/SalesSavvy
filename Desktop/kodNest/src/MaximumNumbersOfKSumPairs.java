import java.util.Arrays;

    public class MaximumNumbersOfKSumPairs {
    public static void main(String[] args) {
        int[] arr={1,5,3,3,3,5};
        int target=6;
        System.out.println(pair(arr,target));
    }
    public static int pair(int[] arr,int target){
        int count=0;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                count++;
                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
