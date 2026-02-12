package LeetCodeProblems;
import java.util.Arrays;
import java.util.Stack;
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int atseriod:asteroids){
            boolean destroyed=false;
            while (!stack.isEmpty() && atseriod<0 && stack.peek() >0){
                int top=stack.peek();
                if(top<-atseriod){
                    stack.pop();
                    continue;
                } else if(top==-atseriod){
                    stack.pop();
                }
                destroyed=true;
                break;
            }
            if(!destroyed){
                stack.push(atseriod);
            }
        }
        int index=0;
        int[] result=new int[stack.size()];
        for(int s:stack){
            result[index++]=s;
        }
        return  result;
    }
}
