import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class MergeAndSortUnique {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3};
        int[] arr2 = {76, 8, 9, 1, 2, 3};
        sort(arr1,arr2);
    }
    public static void sort(int[] arr1, int[] arr2){
        TreeSet<Integer> tree=new TreeSet<>();
        int[] arr3=new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3, arr1.length,arr2.length);
        for (int i=0; i<arr3.length;i++){
            tree.add(arr3[i]);
        }


        System.out.println(tree);
    }
}
