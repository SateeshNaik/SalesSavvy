import java.util.Arrays;

public class SingleElementDelete {
    public static void main(String[] args) {

            int[] arr= {8,2,5,3,2,9,1,2,4,5,2};
            int delete=2;
            int index=-1;
            for(int i=0; i<arr.length;i++) {
                if(arr[i]==delete) {
                    index=i;
                    break;
                }
            }
            if(index ==-1) {
                System.out.println("delete element not found");
            }
            else {

                for(int i=index; i<arr.length-1;i++)
                {
                    arr[i]=arr[i+1];
                }
                arr= Arrays.copyOf(arr, arr.length-1);

                //int[] newArray = Arrays.copyOf(arr,  arr.length-1);

                System.out.println("array of after deletion"+Arrays.toString(arr));



            }

        }
    }

