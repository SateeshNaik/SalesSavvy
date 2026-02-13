public class MoveAllNegative {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        movingElements(arr);
    }

    public static void movingElements(int[] arr) {
        int[] arr1 = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr1[j] = arr[i];
                j++;
            }
            }

        for (int num : arr1) {
            System.out.print(num + " ");
        }

    }
}



