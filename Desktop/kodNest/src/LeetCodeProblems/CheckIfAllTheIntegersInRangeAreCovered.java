package LeetCodeProblems;

import java.util.Arrays;

public class CheckIfAllTheIntegersInRangeAreCovered {
    public static void main(String[] args) {
        int[][] ranges = {
                {1,2},
                {3,4},
                {5,6}

        };
        int left=2, right=5;
        System.out.println(isCovered(ranges,left,right));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {

        for (int i = left; i <= right; i++){
            boolean flag=false;
            for (int j = 0; j < ranges.length; j++) {
                if (i >= ranges[j][0] && i <= ranges[j][1]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;

        }
    public static boolean isCovered1(int[][] ranges, int left, int right) {

        // Since constraints are 1 <= value <= 50
        int[] diff = new int[52]; // extra space for end+1

        // Step 1: Mark ranges using difference array
        for (int[] range : ranges) {
            diff[range[0]] += 1;
            diff[range[1] + 1] -= 1;
        }

        // Step 2: Build prefix sum and check coverage
        int coverage = 0;
        for (int i = 1; i <= 50; i++) {
            coverage += diff[i];

            if (i >= left && i <= right) {
                if (coverage <= 0) {
                    return false;
                }
            }
        }

        return true;
    }



}
