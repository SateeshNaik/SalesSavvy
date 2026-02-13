import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class koKoEatingBananas {
    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int hours=8;
        System.out.println(minEatingSpeed(arr,hours));
    }
    public static int minEatingSpeed(int[] arr,int hours){
        int left=1;
        int right=0;
        for(int pile:arr){
            right=Math.max(right, pile);
        }
        int result=right;
        while (left<=right){
            int mid=left+(right - left)/2;
            Long totalHours= 0L;
            for(int pile:arr){
                totalHours+=(pile +mid -1L)/mid;
            }
            if(totalHours <=hours){
                result=mid;
                right = mid -1;
            } else {
                left =mid +1;
            }
        }
        return result;

    }
}
