package LeetCodeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack  {
    Queue<Integer> input;

    public MyStack() {
        input = new LinkedList<>();
    }
    public void push(int x) {
       input.add(x);
       for(int i=1; i<input.size(); i++){
           input.add(input.remove());
       }

    }
    public int pop() {
        return input.remove();

    }

    public int top() {
        return input.peek();
    }

    public boolean empty() {
        return input.isEmpty();

    }
}

