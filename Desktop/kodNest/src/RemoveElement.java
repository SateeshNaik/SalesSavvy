import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(remove(new int[]{3,2,2,3}, 2));

    }


    public static int remove(int[] arr, int var) {

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != var) {

                    arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}


