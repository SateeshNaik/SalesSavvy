import java.util.ArrayList;
import java.util.List;

public class MissingArray {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1, 2, 3}));
    }

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == 0) {
                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i]);
                    list1.add(arr[j]);
                    list.add(list1);

                }

            }
        }
        return list;
    }

    public static int peakElement(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[i] > arr[i + 1])
                    return i;
            } else {
                if (arr.length - 1 == i && arr[i] > arr[i - 1])
                    return i;
                else  if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                    return i;

            }
        }
        return 1;
    }
}
