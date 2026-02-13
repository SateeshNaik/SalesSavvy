import java.security.spec.RSAOtherPrimeInfo;

public class Geeks {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 10, 10};
         System.out.println( common(arr));
        int[] arr2=new int[arr.length];
        for(int num:common(arr)){
            if(arr[num]!=0){
                System.out.println(num);
            }
        }
    }
    public static int[] common(int[] arr){
           int[] arr1=new int[arr.length];
           int index=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                       // System.out.print(arr[i]+" ");
                        arr1[index]=arr[i];
                        index++;
                    }
                }
            }
            return arr1 ;
    }
}
