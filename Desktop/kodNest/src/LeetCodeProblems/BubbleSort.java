package LeetCodeProblems;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,4,2,8,4,1,0};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        System.out.println(Arrays.toString(heap(arr)));
    }
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while ((j>=0) && (arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] heap(int[] nums){
        Queue<Integer> queue=new PriorityQueue<>();
        for(int i=0; i< nums.length; i++){
            queue.add(nums[i]);
        }
        int[] sortedArray=new int[nums.length];
        for(int i=0; i< nums.length; i++){
            if(!queue.isEmpty()){
                sortedArray[i]=queue.poll();
            }
        }
        return sortedArray;
    }
}
