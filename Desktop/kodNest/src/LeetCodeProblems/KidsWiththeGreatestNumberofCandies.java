package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {

       int[] candies = {4,2,1,1,2};
       int extraCandies = 1;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxNumber) {
                maxNumber = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int addingExtra = candies[i] + extraCandies;
            if (addingExtra >= maxNumber) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
