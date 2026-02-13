import java.util.Collections;
import java.util.LinkedList;

public class ReverseAlternateKNodes {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        int k=2;
      reverse(list,k);

    }
    public static void reverse(LinkedList<Integer> list,int k) {
        boolean reverse = true;

        for (int i = 0; i < list.size(); i += k) {

            int end = Math.min(i + k, list.size());

            if (reverse) {

                Collections.reverse(list.subList(i, end));

            }

            reverse = !reverse;
        }
        System.out.println(list);

    }
}
