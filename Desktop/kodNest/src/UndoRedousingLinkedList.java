import java.util.LinkedList;
import java.util.Scanner;

public class UndoRedousingLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
        System.out.println(undo(str));

    }
    public static String undo(String[] str) {
        LinkedList<String> actions = new LinkedList<>();
        LinkedList<String> redoStack = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("UNDO")) {
                if (!actions.isEmpty()) {
                    redoStack.add(actions.removeLast());
                }
            } else if (str[i].equalsIgnoreCase("REDO")) {
                if (!redoStack.isEmpty()) {
                    actions.add(redoStack.removeLast());
                }
            } else {
                actions.addLast(str[i]);
                redoStack.clear();
            }
        }

        if(actions.isEmpty()){
            return "Empty";
        }
        return String.join(" ", actions);
    }
}
