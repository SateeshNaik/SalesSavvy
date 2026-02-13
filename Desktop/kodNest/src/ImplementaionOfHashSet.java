import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class ImplementaionOfHashSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }
        while (true){
            String command=sc.next();
            if(command.equals("ADD")){
                set.add(sc.nextInt());
                System.out.println(set);
            } else if(command.equals("REMOVE")){
                set.remove(sc.nextInt());
                System.out.println(set);
            } else if(command.equals("CHECK")){
                 if(set.contains(sc.nextInt())){
                     System.out.println("YES");
                 } else {
                     System.out.println("NO");
                 }
            } else if(command.equals("PRINT")){
                if(set.isEmpty()){
                    System.out.println("EMPTY");
                } else {
                    System.out.println(set);
                }
            } else if(command.equals( "STOP")){
                break;

            }
        }
    }
}
