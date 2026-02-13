import java.util.ArrayList;
import java.util.Scanner;

public class SumElementsInArrayListe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);

        }
        System.out.println(sum);
    }
}
