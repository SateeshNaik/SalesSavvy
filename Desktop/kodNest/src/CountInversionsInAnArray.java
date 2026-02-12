public class CountInversionsInAnArray {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(count(arr));

    }
    public static int count(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
