public class maximumAverageSubArray {
    public static void main(String[] args) {
        int[] arr={-1,-12,-3,-5,-8};
        int k=2;
        System.out.printf("%.5f", findMax(arr,k));
    }
    public static double findMax(int[] arr,int k){
        double result= Double.NEGATIVE_INFINITY;
        for(int i=0; i<=arr.length-k; i++){
            double sum=0.0;
            for(int j=i; j<i+k; j++){
                sum+=arr[j];

            }
            double avg=sum/k;
            if(avg>result){
                result=avg;

            }
        }
        return result;

    }
}
