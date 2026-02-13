import java.util.ArrayDeque;
import java.util.Deque;

public class RemovingStarsFromStrings {
    public static void main(String[] args) {
        String str="leet**cod*e";
        removing(str);
    }
    public static void removing(String str){
        String result="";
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0 ;i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        for (Character s:stack){
            result=s+result;

        }
        System.out.println(result);

    }
}
