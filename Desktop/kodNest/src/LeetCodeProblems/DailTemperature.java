package LeetCodeProblems;

import java.util.Arrays;
import java.util.Stack;

public class DailTemperature {
    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures1(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        int i=0;
        int j=1;
        while (i<temperatures.length && j<temperatures.length){
            if(temperatures[i]<temperatures[j]){
                arr[i]=j-i;
                i++;
                j=i+1;
            } else if(j==temperatures.length-1) {
                    i++;

                    j = i + 1;
            }else {
                j++;
            }
        }
        return arr;

    }
    public static int[] dailyTemperatures1(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int previous=stack.pop();
                arr[previous]=i-previous;
            }
            stack.push(i);
            System.out.println(stack);
        }
        return arr;
    }
}
