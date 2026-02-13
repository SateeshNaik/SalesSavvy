import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskPriorityUisngArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> priority = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            tasks.add(sc.next());
            priority.add(sc.next());
        }

        int m = sc.nextInt();
        for (int s = 0; s < m; s++) {
            String str = sc.next();
            String str1 = sc.next();

            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).equals(str)) {
                    priority.set(i, str1);
                }
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("high", 1);
        map.put("medium", 2);
        map.put("low", 3);
        for (int i = 0; i < tasks.size(); i++) {
            for (int j = i + 1; j < tasks.size(); j++) {
                if (map.get(priority.get(i)) > map.get(priority.get(j))) {

                    String tempTask = tasks.get(i);
                    tasks.set(i, tasks.get(j));
                    tasks.set(j, tempTask);

                    String tempPriority = priority.get(i);
                    priority.set(i, priority.get(j));
                    priority.set(j, tempPriority);
                }
            }
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i) + " " + priority.get(i));
        }

        sc.close();
    }
}
