import java.util.Arrays;
import java.util.Scanner;

public class largestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr={3,1,3,2,2,2,1};

        System.out.println(square(arr));
    }

    public static int square(int[] arr){
        int total=0;
        int area=0;
       for(int i=0; i<arr.length; i+=2){
           for(int j=i+1; j<arr.length; j++){
               int min=Math.min(arr[i],arr[j]);
               int width=2;
                total=min*width;

               if(total>area){
                   area=total;
               }
           }

       }
       return area;
    }
}
