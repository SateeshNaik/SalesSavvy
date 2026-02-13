package LeetCodeProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,3};
       int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }

        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>(diff1));
        result.add(new ArrayList<>(diff2));


        return result;

    }
}
