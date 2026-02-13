import java.util.Collections;
import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        System.out.println(pq.peek() +"  ");
        System.out.println();

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}