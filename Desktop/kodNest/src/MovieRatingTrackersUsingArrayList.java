import java.util.ArrayList;
import java.util.Scanner;

public class MovieRatingTrackersUsingArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        ArrayList<String> list =new ArrayList<>();
        list.add("jvkhvkjv4.8");
        list.add("hvjvjj4.7");
        list.add("jygkugk4.9");

        Double sum=0.00;
        for(int k=0; k<list.size(); k++) {
            String str = list.get(k);
            Double number = Double.parseDouble(str.replaceAll("[^0-9.]", ""));
            if(number!=0) {
                sum += number;
            }
        }

        System.out.printf("%.2f" , sum/n);




    }
}
