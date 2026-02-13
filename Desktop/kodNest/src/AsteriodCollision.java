import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class AsteriodCollision {
    public static void main(String[] args) {
        int[] arr={5,10,-5};
        int[] result=collision(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] collision(int[] arr){

        Deque<Integer> stack = new ArrayDeque<>();
        for(int atseriod:arr){
            boolean destroyed=false;
            while (!stack.isEmpty() && atseriod<0 && stack.peekLast() >0){
                int top=stack.peekLast();
                if(top<-atseriod){
                    stack.pollLast();
                    continue;
                } else if(top==-atseriod){
                    stack.pollLast();
                }
                destroyed=true;
                break;
            }
            if(!destroyed){
                stack.addLast(atseriod);
            }
        }
        int[] res=new int[stack.size()];
        int i=0;
        for(int val:stack){
            res[i++]=val;
        }
        return res;

    }
}
