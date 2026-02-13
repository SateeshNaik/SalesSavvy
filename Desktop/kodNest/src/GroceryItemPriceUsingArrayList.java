import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItemPriceUsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Integer> items= new ArrayList<>();
        for(int  i=0; i<n; i++){
            list.add(sc.next());
            items.add(sc.nextInt());
        }



        for(int i=0; i<list.size(); i++){
            for(int j=0; j<items.size(); j++) {
                System.out.print(list.get(i)  +" - "+ "\u20B9" +items.get(j));
                if (i != list.size() - 1) {
                    System.out.print(",");
                    i++;

                }
            }
        }

    }
}
