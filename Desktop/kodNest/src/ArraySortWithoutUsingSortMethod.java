import java.util.Arrays;

public class ArraySortWithoutUsingSortMethod {
    public static void main(String[] args) {
        int[] arr={10,5,20,3,4,9,0};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
        sorting(arr);

    }
    public  static void sorting(int[] arr){
        for(int i=0; i<arr.length-2; i++) {
            int min = arr[i];
            int pos = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
