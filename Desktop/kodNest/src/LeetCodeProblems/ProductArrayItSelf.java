package LeetCodeProblems;

import java.util.Arrays;

public class ProductArrayItSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(product(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];

        int index=0;
        for(int i=0; i<nums.length; i++){
            int mul=1;
            for(int j=0; j<nums.length; j++){
                if(i==j){
                } else {
                    mul=mul*nums[j];
                }
            }
            arr[i]=mul;
            index++;
        }
        return arr;

    }
    public static int[] product(int[] nums){
        int[] arr=new int[nums.length];
        int left=1;
        for(int i=0; i<nums.length; i++){
            arr[i]=left;
            left=left*nums[i];
        }

        int right=1;
        for(int j=nums.length-1; j>=0; j--){
            arr[j]=arr[j]*right;
            right=right*nums[j];
        }


        return arr;
    }
}
