import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCompression {
    public static void main(String[] args) {
        char[] ch={'a','b','c'};
        System.out.println(compress1(ch));
        char[] ch1={'a','a','a','a','a','b'};
        System.out.println(compress1(ch1));
        char[] ch2={'a'};
        System.out.println(compress1(ch2));
        char[] ch3={'a','a','b','b'};
        System.out.println(compress1(ch3));
    }

    public static int  compress1(char[] ch){
        int count=1 , length=1;
        int index=0;
        char c=ch[0];
        for(int i=1; i<ch.length; i++){
            if(c==ch[i]){
                count++;
            }
             else {
                ch[index] = c;
                index++;
                if(count!=1) {
                    char[] array=String.valueOf(count).toCharArray();
                    for(char d:array) {
                        ch[index] = d;
                        length++;
                        index++;
                    }
                }
                    c = ch[i];
                    count = 1;
                    length++;

            }
            if(i==ch.length-1 ){
                
                ch[index]=c;
                index++;
                if(count>1) {
                    char[] array = String.valueOf(count).toCharArray();
                    for (char d : array) {
                        ch[index] = d;
                        length++;
                        index++;
                    }
                }

            }

        }
        System.out.println(Arrays.toString(ch));
        return length;
    }
}
