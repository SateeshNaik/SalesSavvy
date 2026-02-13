import java.util.ArrayList;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.println(indexFinding(arr));
    }
    public static int indexFinding(int[] arr){
        int leftSum=0;
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        for(int i=0; i<arr.length; i++){
            totalSum =totalSum-arr[i];
            if(leftSum==totalSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;

    }
}
