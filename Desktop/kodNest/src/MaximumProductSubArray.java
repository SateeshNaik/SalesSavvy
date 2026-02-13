public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr={5,4,-1,7,8};
        System.out.println(sub(arr));
    }
    public static int sub(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int mul=1;
        int total=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                mul=1;
            } else {
                mul = mul * arr[i];
                if (mul > total) {
                    total = mul;
                }
            }
        }
        return total;
    }

}
