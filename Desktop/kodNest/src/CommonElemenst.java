import java.util.ArrayList;

public class CommonElemenst {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};

        int[] arr2={6,7,8,5,1};
        System.out.print("common elemets:");
        System.out.println(common(arr1,arr2));
    }
    public static ArrayList<Integer> common(int[] arr1, int[] arr2){
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        return list;
    }
}
