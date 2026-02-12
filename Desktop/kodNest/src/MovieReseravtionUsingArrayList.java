import java.util.ArrayList;
import java.util.Scanner;
public class MovieReseravtionUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> seats = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
            seats.add(sc.nextInt());
        }
        int m = sc.nextInt();
        String name = "";
        for (int s = 0; s < m; s++) {
            name = sc.next();


            for (int i = names.size() - 1; i >= 0; i--) {
                if (names.get(i).equals(name)) {
                    names.remove(i);
                    seats.remove(i);

                }
            }
            for (int i = 0; i < seats.size(); i++) {
                for (int j = i + 1; j < seats.size(); j++) {
                    if (seats.get(i).equals(seats.get(j))) {
                        names.remove(j);
                        seats.remove(j);
                        j--;
                    }
                }
            }
        }

            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i) + " - seats " + seats.get(i));
            }
        }
    }




