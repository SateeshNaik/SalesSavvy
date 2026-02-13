public class TotalCount {
    public static void main(String[] args) {

        int[] arr = {5, 8, 10, 13};
        int k = 3;
        System.out.println(totalCount(arr,k));

    }
     public static int totalCount( int[] arr, int k) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=k) {
                sum += 1;
            } else {
                int diff = arr[i] / k;
                int remainder= arr[i] % k;
                sum += diff + (remainder > 0 ? 1 : 0);
            }


        }

      return sum;
    }
}
