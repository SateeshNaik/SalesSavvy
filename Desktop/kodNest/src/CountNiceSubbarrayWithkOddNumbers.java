public class CountNiceSubbarrayWithkOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println(count(arr, k));
    }

    public static int count(int[] arr, int k) {
        int count = 0;
        int odd = 0;
        int[] freq = new int[arr.length + 1];
        freq[0] = 1;
        for (int num : arr) {
            if (num % 2 != 0)
                odd++;

            if (odd - k >= 0) {
                count += freq[odd - k];
            }
            freq[odd]++;


        }
        return count;
    }
}

