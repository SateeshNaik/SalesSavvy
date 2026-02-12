import java.util.HashSet;
import java.util.Scanner;

public class FindingTheIntersectionTwoArraysHashSet {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int m=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0; i<m; i++){
            arr1[i]=sc.nextInt();
        }
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
       if(set.equals(set1)){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
}
