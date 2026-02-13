public class ArrayRotationByOne {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;
        }
        for(int arr1:arr){
            System.out.print(arr1 +" ");
        }
    }
}
