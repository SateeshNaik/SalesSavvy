import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedUniqueUsingTreeSet {
    public static void main(String[] args) {
        NavigableSet<String> tree= new TreeSet<>();
        tree.add("java");
        tree.add("javascript");
        tree.add("jasmine");
        tree.add("python");
        tree.add("php");
        tree.add("kotlin");
        String prefix="p";
        System.out.println(isprefix(tree,prefix));

    }
    public static NavigableSet<String> isprefix(NavigableSet<String> tree, String prefix){
        String hi=prefix +Character.MAX_VALUE;
        return tree.subSet(prefix,true,hi,true);
    }
}
