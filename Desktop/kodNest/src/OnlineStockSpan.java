import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class OnlineStockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StockSpanner stockSpanner = new StockSpanner();
        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            System.out.println(stockSpanner.next(price));
        }
    }
}
