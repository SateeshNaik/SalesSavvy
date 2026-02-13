import java.util.Arrays;

public class ProductArrayItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result=product(arr);
        System.out.println(Arrays.toString(result));


    }
    public static int[] product(int[] arr){
        int[] arr1=new int[arr.length];
        int left=1;
        for(int i=0; i<arr.length; i++){
            arr1[i]=left;
            left=left*arr[i];
        }
        int right=1;
        for(int i=arr.length-1; i>=0; i--){
            arr1[i]=right;
            right=right*arr[i];
        }
        return arr1;

        }
}
