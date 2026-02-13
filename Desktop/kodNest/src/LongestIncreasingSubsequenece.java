public class LongestIncreasingSubsequenece {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,2,3};
        System.out.println( longest(arr));
    }
    public static int longest(int[] arr){
        int maxcount=1;

        for(int i=0; i<arr.length; i++){
            int count=1;
            int prev=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>prev){
                    count++;
                    prev=arr[j];
                }
            }
            if(count>maxcount){
                maxcount=count;
            }
        }
        return maxcount;
    }
}
