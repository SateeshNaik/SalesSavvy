import java.util.ArrayList;
import java.util.List;

public class FindingTheNextGreaterElement {
    public static void main(String[] args) {
            int[] arr1={4,1,2};
            int[] arr2={1,3,4,2};
        System.out.println(greater(arr1,arr2));
    }
    public static List<Integer> greater(int[] arr1, int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            int num=arr1[i];
            int nextgreater=-1;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == num) {
                    for (int k = j + 1; k < arr2.length; k++) {
                        if (arr2[k] > num) {
                            nextgreater = arr2[k];
                            break;
                        }
                    }
                    break;
                }
            }
                list.add(nextgreater);
        }
            return list;

    }
}

