import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindingKthSnallestUsingTreeset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        System.out.println(smallestElement(arr,ele));

    }
    public static int smallestElement(int[] arr,int ele){
        Set<Integer> tree=new TreeSet<>();
        for(int i=0; i< arr.length; i++){
            tree.add(arr[i]);

        }
        int count=0;
        for(int num:tree){
            count++;
            if(count==ele){
                return num;
            }
        }
        return -1;


    }
}
