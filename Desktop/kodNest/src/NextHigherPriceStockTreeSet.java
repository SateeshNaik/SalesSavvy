import java.util.Scanner;
import java.util.TreeSet;

public class NextHigherPriceStockTreeSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i=0; i<n; i++) {
            tree.add(sc.nextInt());
        }
            int q=sc.nextInt();
            for(int i=0; i<q; i++){
                int target=sc.nextInt();
                System.out.println(nextHigher(tree, target));
            }

    }
    public static int nextHigher(TreeSet<Integer> tree ,int target){
        Integer result = tree.ceiling(target);
        return (result != null) ? result : -1;

    }

}
