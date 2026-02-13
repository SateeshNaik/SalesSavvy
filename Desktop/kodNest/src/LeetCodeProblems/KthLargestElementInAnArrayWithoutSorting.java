package LeetCodeProblems;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArrayWithoutSorting {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue=new PriorityQueue();
        for(int s:nums){
            queue.add(s);
        }
        System.out.println(queue);
        for(int i=0; i<nums.length; i++) {
            if(queue.size()==k){
                break;
            } else {
                queue.poll();
            }
        }
        System.out.println(queue);

        return queue.poll();
    }
}
