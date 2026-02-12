package LeetCodeProblems;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfSubAarraysWithOddSum {
        static final int MOD = 1_000_000_007;

        public static void main(String[] args) {
            int[] arr ={1,2,3,4,5,6,7};
            //System.out.println(rangeSum(arr));
            System.out.println(numOfSubarrays(arr));
        }
        public static int rangeSum(int[] arr) {
            int n = arr.length;
            int arrLength = n * (n + 1) / 2;
            long[] nums = new long[arrLength];
            int index = 0;
            long sum = 0;
            for (int i = 0; i <n; i++) {
                sum += arr[i];
                nums[index++] = sum;
            }
            for (int i = 1; i < n; i++) {
                long currentSum = 0;
                int s = i;
                while (s < n) {
                    currentSum += arr[s];
                    nums[index++] = currentSum;
                    s++;
                }
            }
            System.out.println(Arrays.toString(nums));
            List<Long> list = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if(nums[i]%2!=0){
                    list.add(nums[i]);
                }
            }
            System.out.println(list);
            return list.size();
        }



    public static int numOfSubarrays(int[] arr) {
        int result = 0;
        int odd = 0, even = 1;
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum = (prefixSum + num) % 2;
            if (prefixSum == 0) {
                result = (result + odd) % MOD;
                even++;
            } else {
                result = (result + even) % MOD;
                odd++;
            }
        }
        return result;
    }
}



