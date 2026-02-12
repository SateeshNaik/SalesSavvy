import java.util.Arrays;

public class SuccessFulPairsOfSpellsandPositions {
    public static void main(String[] args) {
        int[] arr1={3,1,2};
        int[] arr2={8,5,8};
        int target=16;
        System.out.println(Arrays.toString(pairs(arr1,arr2,target)));
    }
    public static int[] pairs(int[] arr1,int[] arr2,int target){
        int[] pair=new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            int count=0;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]*arr2[j]>=target){
                    count++;
                }
            }
            pair[i]=count;
            {

            }
        }
        return pair;
    }
}
