import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProductInventorySystemUisngArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> team = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            team.add(sc.next());
            score.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int s = 0; s < m; s++) {
            String update = sc.next();
            int value = sc.nextInt();
            for (int i = 0; i < team.size(); i++) {
                if (team.get(i).equals(update)) {
                    int diff = score.get(i);
                    int result = diff + value;
                    score.set(i, result);
                }
            }
        }
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            indexes.add(i);
        }
        Collections.sort(indexes, (i, j) -> score.get(j) - score.get(i));
        if(team.size()>3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(team.get(i) + " " + score.get(i));
            }
        } else {
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i) + " " + score.get(i));
            }

        }
    }

}