import java.util.HashSet;
import java.util.Scanner;

public class ImplementHashcodeAndEqualsMEthods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Person> details=new HashSet<>();
        for(int i=0; i<n; i++){
            String name=sc.next();
            int age=sc.nextInt();
            Person person=new Person(name,age);
            details.add(person);
        }
        for (Person person:details){
            System.out.println(person);
        }
    }
}
