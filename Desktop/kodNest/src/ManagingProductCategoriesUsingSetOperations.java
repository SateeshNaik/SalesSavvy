import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ManagingProductCategoriesUsingSetOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<String> tree1 = new TreeSet<String>();
        for(int i=0; i<n; i++){
            tree1.add(sc.next());
        }
        int m=sc.nextInt();
        TreeSet<String> tree2 = new TreeSet<String>();
        for(int i=0; i<m; i++){
            tree2.add(sc.next());
        }
        TreeSet<String> unionSet=new TreeSet<>(tree1);
       unionSet.addAll(tree2);
      printSet(unionSet);

        TreeSet<String> intersectionSet=new TreeSet<>(tree1);
        intersectionSet.retainAll((tree2));
        printSet(intersectionSet);

        TreeSet<String> differenceSet=new TreeSet<>(tree1);
        intersectionSet.removeAll((tree2));
        printSet(differenceSet);



    }
    public static void printSet(TreeSet<String> set){
        if(set.isEmpty()){
            System.out.println("No products");
        } else {
            for(String s : set){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
