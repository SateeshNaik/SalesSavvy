package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0; i<nums.length; i++){
            while (!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                arr[stack.pop()]=nums[i];
                System.out.println(stack);
            }
            stack.push(i);
            System.out.println(stack);
        }
        for(int i=0; i<nums.length; i++){
            while (!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                arr[stack.pop()] =nums[i];
                System.out.println(stack);
            }
        }
        return arr;

    }
}
