package LeetCodeProblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class TotalCostToHireKWorkers {
    public static void main(String[] args) {
        int[] costs = {31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58};
        int k = 11;
        int candidates = 2;
        System.out.println(totalCost(costs,k,candidates));
    }


    public static long totalCost(int[] costs, int k, int candidates) {
        Queue<Integer> leftQueue = new PriorityQueue<>();
        Queue<Integer> rightQueue = new PriorityQueue<>();

        int left = 0;
        int right = costs.length - 1;
        long result = 0;

        for (int i = 0; i < candidates; i++) {
            if (left <= right)
                leftQueue.add(costs[left]);
            left++;
            if (left <= right)
                rightQueue.add(costs[right]);
            right--;
        }


        for (int i = 0; i < k; i++) {
            if (rightQueue.isEmpty() || (!leftQueue.isEmpty() && leftQueue.peek() <= rightQueue.peek())) {
                result += leftQueue.poll();
                if (left <= right) {
                    leftQueue.add(costs[left]);
                    left++;
                }
            } else {
                result += rightQueue.poll();
                if (left <= right) {
                    rightQueue.add(costs[right]);
                    right--;
                }
            }
        }
        return result;
    }
}
