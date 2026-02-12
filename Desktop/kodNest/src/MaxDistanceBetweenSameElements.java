import java.util.HashMap;

public class MaxDistanceBetweenSameElements {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(maxDistance(arr));
    }

    public static int maxDistance(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            } else {
                int diff=i-map.get(arr[i]);
                result=Math.max(result,diff);

            }
        }
        return result;
    }
}

