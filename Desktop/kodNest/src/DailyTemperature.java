import java.util.Arrays;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] arr={30,40,50,60,70};
        System.out.println(Arrays.toString(daily(arr)));
    }
    public static int[] daily(int[] arr){
        int i=0, j=1;
        int[] arr1=new int[arr.length];
        while(i<arr.length && j<arr.length){
            if(arr[i]<arr[j]){
                arr1[i]=j-i;
                i++;
                j=i+1;
            } else {
                j++;
            }
        }
        return arr1;

    }
}
