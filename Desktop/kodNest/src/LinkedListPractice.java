import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListPractice {
    public static void main(String[] args) {
        Deque<Integer> stack=new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.poll();
        System.out.println(stack);






    }
}
