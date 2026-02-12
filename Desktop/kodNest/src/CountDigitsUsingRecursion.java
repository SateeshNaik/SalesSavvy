

import java.util.*;

import static java.lang.System.in;
import static java.util.Collections.*;

public class CountDigitsUsingRecursion{
    public static void main(String[] args) {
        System.out.println(alpha(-12345));

    }
    public static int alpha(int n){
        n = Math.abs(n);
        if(n<=0){
            return 0;
        }

        return 1+(alpha(n/10));
    }


}
