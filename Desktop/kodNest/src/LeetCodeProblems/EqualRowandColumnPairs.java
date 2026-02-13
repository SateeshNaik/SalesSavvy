package LeetCodeProblems;

import java.util.Arrays;

public class EqualRowandColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {
                {3,2,1},
                {1,7,6},
                {2,7,7}

        };
        System.out.println(equalPairs(grid));
    }
    public static int equalPairs(int[][] grid) {
        int[][] arr=new int[grid.length][grid.length];
        for(int i=0; i< grid.length;i++){
            for(int j=0; j<grid.length; j++){
                arr[i][j]=grid[j][i];
            }
        }
        int count=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                boolean flag = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != arr[j][k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    count++;
            }
        }
        return count;
    }
}
