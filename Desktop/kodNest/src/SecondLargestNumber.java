import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr);
        int firstHigest=arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--){
            if(firstHigest>arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    }

}
