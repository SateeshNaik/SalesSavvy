public class SumOfPairsClosest {
    public static void main(String[] args) {
        int[] arr={10, 30, 20, 5};
        int target=25;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i );
                }
            }
        }
    }
}
