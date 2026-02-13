
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindingProductWithInRangeTreeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            tree.add(sc.nextInt());
        }
        int min = sc.nextInt();
        int max = sc.nextInt();

        if (tree.isEmpty()) {
            System.out.println("No products");

        }
        else {
             Set<Integer> subSet=tree.subSet(min,true, max,true);
            if(subSet.isEmpty()){
                System.out.println("No products in range");
            } else {
                for (Integer s : subSet) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
