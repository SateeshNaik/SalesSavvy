import java.util.LinkedList;
import java.util.Scanner;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            list.add(str);
        }
    }
}
