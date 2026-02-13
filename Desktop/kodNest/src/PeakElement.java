public class PeakElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(peakElement(arr));
    }
    public static int peakElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr.length==1)
                return 0;
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
