import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoSetsOfUniqueNumTreeset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for (int i=0; i<m; i++){
            arr1[i]=sc.nextInt();

        }
        Set<Integer> tree=new TreeSet<>();
        for(int num:arr){
            tree.add(num);
        }
        for(int num:arr1){
            tree.add(num);
        }
        for (Integer num:tree){
            System.out.print(num +" ");
        }
    }
}
