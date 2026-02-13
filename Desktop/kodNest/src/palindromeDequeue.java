import java.util.ArrayDeque;

public class palindromeDequeue {
    public static void main(String[] args) {
        String str="madam".toLowerCase();
        ArrayDeque<Character> dq=new ArrayDeque<>();
        for(char c:str.toCharArray()){
            dq.addLast(c);
        }
        boolean palindrome=true;
        while (dq.size()>1){
            if(!dq.removeFirst().equals(dq.removeLast())){
                palindrome=false;
                break;
            }

        }
        System.out.println(str + (palindrome ? " is palindrome" : " Not palindrome"));

    }

}
