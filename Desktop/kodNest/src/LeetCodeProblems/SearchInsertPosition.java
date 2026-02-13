package LeetCodeProblems;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr,target));

    }
    public static int searchInsert(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
            int midvalue=0;
        while (left <= right) {
            midvalue = left +(right-left)/2;

            if (arr[midvalue] == target) {
                return midvalue;
            } else if (arr[midvalue] <= target) {
                left = midvalue + 1;

            } else {
                right = midvalue - 1;
            }
        }
        return left;

    }
}
