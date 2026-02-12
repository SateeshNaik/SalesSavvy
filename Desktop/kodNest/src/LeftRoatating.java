import java.util.Arrays;

public class LeftRoatating {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(rotateArray(new int[]{101, 102, 103, 104,105 })));

        }

        public static int[] rotateArray(int[] arr){
            for(int j = 0; j< 1; j++){
                int index=0;
                for(int i = index+1; i< arr.length; i++){
                    int temp= arr[i];
                    arr[i]= arr[index];
                    arr[index]=temp;
                    index++;

                }
            }
            return arr;


        }
    }

