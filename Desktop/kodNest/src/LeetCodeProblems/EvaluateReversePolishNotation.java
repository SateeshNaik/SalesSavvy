package LeetCodeProblems;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
      String[] s= {"18"};
        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                if(!stack.isEmpty()){
                    int a=stack.pop();
                    int b=stack.pop();
                    stack.push(a+b);
                }
            }  else if(s.equals("-")) {
                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b-a);
                }
            } else if(s.equals("*")) {
                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a*b);
                }
            }
            else if(s.equals("/")) {
                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                }
            } else {
                stack.push(Integer.parseInt(s));
                System.out.println(stack);
            }

    }
        return stack.pop();
    }
    }
