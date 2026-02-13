import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,6,8,9};
        System.out.println(ranges(arr));
    }
    public static List<String> ranges(int[] arr){
        List<String> list=new ArrayList<>();
        int start=arr[0];
        int end=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]==end+1){
                end=arr[i];
            } else {
                if(start==end){
                   list.add(String.valueOf(start));
                    start=end=arr[i];

                } else {
                    list.add(start+"->"+end);
                    start=end=arr[i];
                }
            }

        }
        if(start==end){
            list.add(Integer.toString(start));
        } else {
            list.add(start+"->"+end);
        }
        return list;

    }
}
