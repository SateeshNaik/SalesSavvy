public class LongestSubArrayOfOnesAfterDeletingOne {
    public static void main(String[] args) {
        int[] arr={1,1,0,1};
        System.out.println(counting(arr));
    }
    public static int counting(int[] arr){
        int max=0;
        for(int i=0; i<arr.length;i++) {
            int count=0;
            int zerosCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zerosCount++;
                }
                if (zerosCount > 1) {
                    break;
                }
                count++;
            }
            max=Math.max(count,max);

        }
        return max-1;

    }
}
