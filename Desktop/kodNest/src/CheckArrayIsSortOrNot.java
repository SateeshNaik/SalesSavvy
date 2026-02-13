import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayIsSortOrNot {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 5};
        if (sor(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean sor(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;

    }
}



