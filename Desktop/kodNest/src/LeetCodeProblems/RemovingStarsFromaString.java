package LeetCodeProblems;

import java.util.Stack;

public class RemovingStarsFromaString {
    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));

    }

    public static String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
                System.out.println(stack);
            }
        }
        StringBuilder result= new StringBuilder();
       for( int i=0; i<stack.size(); i++){
           result.append(stack.get(i));
       }
        return result.toString();
    }
}
