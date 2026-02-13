import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr={16 ,17, 4 ,3 ,5, 2};
        ArrayList<Integer> result1=new ArrayList<>();
        int maximumFromRight=arr[arr.length-1];
        result1.add(maximumFromRight);
        for(int i=arr.length-2; i>=0; i--){
            if(maximumFromRight<=arr[i]){
                result1.add(arr[i]);
                maximumFromRight=arr[i];

            }
        }
        for(int value:result1)
            System.out.println(value);
    }
}
