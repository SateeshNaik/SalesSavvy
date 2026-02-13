package LeetCodeProblems;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] population = new int[101];


        for (int[] log : logs) {
            population[log[0] - 1950]++;
            population[log[1] - 1950]--;

        }

        int maxPop = 0;
        int currentPop = 0;
        int year = 1950;

        for (int i = 0; i < 101; i++) {
            currentPop += population[i];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                year = 1950 + i;
            }
        }

        return year;
    }
}
