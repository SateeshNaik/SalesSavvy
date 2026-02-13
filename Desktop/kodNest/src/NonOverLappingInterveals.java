//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class NonOverLappingInterveals {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr1 = new int[n];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        int[] arr2 = new int[n];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
//
//        System.out.println(overLapping(arr));
//    }
//    public static int overLapping(int[][] arr) {
//        if (arr.length == 0) return 0;
//
//
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//
//                return Integer.compare(a[1], b[1]);
//            }
//        });
//
//        int count = 0;
//        int end = arr[0][1];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i][0] < end) {
//                count++;
//            } else {
//                end = arr[i][1];
//            }
//
//        }
//        return count;
//    }
//}
