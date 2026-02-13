import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchSuggestionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] products = new String[n];
        for (int i = 0; i < n; i++) {
            products[i] = sc.next();
        }
        String searchWord = sc.next();
        List<List<String>> result = suggestProducts(products, searchWord);
        for(List<String> list:result){
            System.out.println(list);
        }
    }

    public static List<List<String>> suggestProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            List<String> list = new ArrayList<>();
            for (int j = 0; j < products.length; j++) {
                if (products[j].startsWith(prefix)) {
                    list.add(products[j]);
                    if (list.size() == 3)
                        break;
                }
            }

            result.add(list);
        }

        return result;
    }
}
