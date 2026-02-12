import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String str="3[a]2[bc]";
        System.out.println(decodeString(str));
    }
    public static String decodeString(String str){
        Stack<Integer> stackInt=new Stack<>();
        Stack<String> stackStr=new Stack<>();
        String currrentString="";
        int number=0;
        for (int i=0;i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            } else if(ch=='['){
                stackInt.push(number);
                stackStr.push(currrentString);
                number=0;
                currrentString="";
            } else if(ch==']'){
               int repeatCount=stackInt.pop();
                System.out.println(stackStr);
               StringBuilder temp=new StringBuilder(stackStr.pop());
               for(int j=0; j<repeatCount; j++) {
                   temp.append(currrentString);
               }
                currrentString = temp.toString();
            }else {
                currrentString +=ch;
            }
        }
       return currrentString;
    }
}

