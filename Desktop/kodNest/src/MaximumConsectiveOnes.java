public class MaximumConsectiveOnes {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;

        System.out.println(ones(arr,k));
    }
    public static int ones(int[] arr,int k){
        int max=0;
        int left=0;
        int right=0;
        int zerosCount = 0;
        for( right=0; right<arr.length;right++) {
            if(arr[right]==0) {
                zerosCount++;
            }

            while (zerosCount>k){
                if(arr [left]==0){
                    zerosCount--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }

            return max;
    }

}
