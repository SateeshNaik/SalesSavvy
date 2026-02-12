package LeetCodeProblems;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] intervals = new int[n][2];
            for (int i = 0; i < n; i++) {
                intervals[i][0] = sc.nextInt();
                intervals[i][1] = sc.nextInt();
            }

            System.out.println(Arrays.deepToString(merge(intervals)));
        }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {

                return Integer.compare(a[0], b[0]);
            }
        });
        List<List<Integer>> list=new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if (intervals[i][0]<=end) {
                end = Math.max(end,intervals[i][1]);
            } else {
                List<Integer> list1=new ArrayList<>();
                    list1.add(start);
                    list1.add(end);
                list.add(list1);
                start=intervals[i][0];
                end=intervals[i][1];
            }

        }
        List<Integer> list1=new ArrayList<>();
        list1.add(start);
        list1.add(end);
        list.add(list1);
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i).get(0);
            result[i][1] = list.get(i).get(1);
        }
     return result;
    }
}
