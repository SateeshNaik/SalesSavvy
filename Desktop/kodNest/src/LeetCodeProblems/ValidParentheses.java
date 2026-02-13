package LeetCodeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{()}";
        if(checker(str)){
            System.out.println("Balanced");
        } else {
            System.out.println(" Not balanced");
        }
    }
    public static boolean checker(String exp){
        Deque<Character> dq=new ArrayDeque<>();
        for(char ch: exp.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                dq.push(ch);
            } else if(ch==')' || ch=='}' || ch==']'){
                if(dq.isEmpty())
                    return false;
                char top=dq.pop();
                if((ch==')'  &&  top!='(') || (ch=='}'  &&  top!='{') ||  (ch==']'  &&  top!='[')){
                    return false;
                }
            }
        }
        return dq.isEmpty();
    }
}
