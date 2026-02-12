import java.util.NavigableSet;
import java.util.*;

public class PrefixSearchUsingTreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("java");
        tree.add("javaScript");
        tree.add("jasmine");
        tree.add("python");
        tree.add("php");
        tree.add("kotlin");
        String prefix="ja";
        SortedSet<String> matches=prefixSearch(tree,prefix);
        System.out.println("matches:" + (matches.isEmpty()? "None": matches));

    }
    public static SortedSet<String> prefixSearch(TreeSet<String> tree, String prefix){
        String hi=prefix + Character.MAX_VALUE;
        return tree.subSet(prefix,true,hi,true);

    }
}
