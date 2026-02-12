import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicateUsingHashSet {
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();
        set.add(101);
        set.add(102);
        set.add(109);
        set.add(101);
        set.add(104);
        set.add(102);
        set.add(105);

        TreeSet<Integer> treeSet=new TreeSet<>(set);
        for(int num:treeSet){
            System.out.println(num);
        }
        System.out.println(set);

    }
}
