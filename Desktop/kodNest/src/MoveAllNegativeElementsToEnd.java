import java.util.Arrays;

public class MoveAllNegativeElementsToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > 0
                ) {
                } else {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}



