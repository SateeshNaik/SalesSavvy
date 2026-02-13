import java.util.*;

public class CombinationOfSumThree {
    public static void main(String[] args) {
        int k=2;
        int n=4;
        System.out.println(combination(k,n));
    }
    public static List<List<Integer>> combination(int k,int n){
        List<List<Integer>> result = new ArrayList<>();
        int range=n-1;
        int[] arr=new int[range];
        for(int i=0; i<arr.length; i++){
            arr[i]=range;
            range--;
        }


        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            System.out.println(list);

            if (list.size() == k) {
                int sum = 0;
                for (int j = 0; j < k; j++) {
                    sum += list.get(i);
                }
                if (sum == n) {
                    result.add(list);
                    System.out.println(list);
                }
            }
        }




        return result;
    }
}
