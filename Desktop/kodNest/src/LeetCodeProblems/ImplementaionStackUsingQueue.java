package LeetCodeProblems;

public class ImplementaionStackUsingQueue {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println(myStack.pop());

    }
}
