import java.util.Stack;

public class StockSpanner {
    private Stack<int[]> stack;
    public StockSpanner(){
        stack=new Stack<>();
    }
    public int next(int price){
        int span=1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            span=span+stack.peek()[1];
        }
        stack.push(new int[]{price,span});

        return span;
    }
}
