public class StackImplementationArray {
    public static void main(String[] args) {
        Stacks stack=new Stacks(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
    }
}
