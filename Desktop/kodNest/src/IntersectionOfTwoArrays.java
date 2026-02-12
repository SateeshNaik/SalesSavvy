import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(intersection(new int[]{1, 2, 2, 1}, new int[]{2}));

    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        int n = nums1.length <nums2.length ? nums1.length :nums2.length;

        int previousElement=0;
        for(int i=0; i<nums1.length; i++) {
            if(previousElement != nums1[i]) {
                previousElement=nums1[i];
                for(int j=0; j<nums2.length; j++) {
                    if(nums1[i]==nums2[j]) {
                        list.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]= list.get(i);
        }
        return arr;
    }
}

