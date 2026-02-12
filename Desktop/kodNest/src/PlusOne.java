import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={9};
        System.out.println((Arrays.toString (plus(arr))));


    }
    public static int[] plus(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] arr1=new int[arr.length+1];
        arr1[0]=1;
        return arr1;

    }


}
