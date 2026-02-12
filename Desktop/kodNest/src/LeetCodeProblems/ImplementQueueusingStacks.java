package LeetCodeProblems;

public class ImplementQueueusingStacks {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
            queue.push(10);
            queue.push(20);
            queue.push(30);
            System.out.println(queue.peek());
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            queue.push(40);
            System.out.println(queue.peek());
            System.out.println(queue.pop());
            System.out.println(queue.pop());
            System.out.println(queue.empty());
        }
    }

