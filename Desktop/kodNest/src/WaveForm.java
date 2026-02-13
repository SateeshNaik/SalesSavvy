public class WaveForm {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        sortInWave(arr);

    }
    public static void sortInWave(int arr[]){
       for(int i=0; i<arr.length-1; i+=2){
           if(arr[i]<arr[i+1] ) {
               int temp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = temp;
           }
       }
       for(int num:arr){
           System.out.print(num+" ");
       }
    }
}
