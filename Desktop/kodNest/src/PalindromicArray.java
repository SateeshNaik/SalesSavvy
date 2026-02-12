public class PalindromicArray {
    public static void main(String[] args) {

        int[] arr = {111, 222, 333, 474, 555,123};
        boolean result=true;
        for(int i=0; i<arr.length; i++) {
            if (isPalindromic(arr[i])==false) {
                result=false;
                break;

            }
        }
        System.out.println(result);

    }


    public static boolean isPalindromic(int num) {
        int reversed = 0;
        int temp=num;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;

        }
        return reversed == temp;
    }
}
