import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfChocolates {
    public static void main(String[] args) {
        int[] arr={4,2,1,1};
        int extraChocolate=2;
        System.out.println(chocolates(arr,extraChocolate));

    }
    public static List<Boolean> chocolates(int[] arr, int extraChocolate){
        int maximum=0;
        for(int num:arr){
            maximum=Math.max(maximum,num);

        }
        List<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num+extraChocolate);
        }
        List<Boolean > list2=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>=maximum){
                list2.add(true);
            } else {
                list2.add(false);
            }
        }

        return list2;
    }
}
