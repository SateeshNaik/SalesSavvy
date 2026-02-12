import java.util.HashMap;
import java.util.Map;

public class IntergerToRoman {
    public static void main(String[] args) {
            int n = 9;
            System.out.println(roman(n));
        }
        public static String roman(int n){
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (n >= values[i]) {
                    n -= values[i];
                    sb.append(symbols[i]);
                }
            }
            return sb.toString();
    }
}
