import java.util.*;

public class MaximumSubsequnceScore {
    public static void main(String[] args) {
        int[] arr1 = {1,3,3,2};
        int[] arr2 = {2,1,3,4};
        int k = 3;
        System.out.println(maxScore(arr1, arr2, k));
    }

    public static int maxScore(int[] arr1, int[] arr2, int k) {
        int sum=0,maxscore=0;
        int n=arr1.length;
        int[][] pairs=new int[n][2];
        for(int i=0; i<n; i++){
            pairs[i][0]=arr2[i];
            pairs[i][1]=arr1[i];
        }
        Arrays.sort(pairs, new Comparator<int[]>(){
           public int compare(int[] a,int [] b){
               return Integer.compare(b[0],a[0]);
           }
        });
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int[] pair:pairs){
            int nums2=pair[0];
            int nums1=pair[1];
            minHeap.offer(nums1);
            sum+=nums1;

            if(minHeap.size()>k){
                sum-=minHeap.poll();
            }
            if (minHeap.size()==k){
                maxscore=Math.max(maxscore,sum*nums2);
            }
        }
        return maxscore;
    }
}
