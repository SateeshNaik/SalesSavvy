import java.util.*;

public class FindThediffTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,4,6};
        System.out.println(diff(arr1,arr2));

    }
    public static List<List<Integer>> diff(int[] arr1,int[] arr2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }
        for(int i=0; i<arr1.length; i++){
            set2.add(arr2[i]);

        }
      Set<Integer> diff1=new HashSet<>(set1);
        Set<Integer> diff2 = new HashSet<>(set2);
        diff1.removeAll(set2);
        diff2.removeAll(set1);

        List<List<Integer>> result =new ArrayList<>();
        result.add(new ArrayList<>(diff1));
        result.add(new ArrayList<>(diff2));

return result;
    }
}
