import java.util.Scanner;

public class ATM {
    int un;
    int pwd;
    void validate()
    {
        System.out.println("connection to BD established..");

        Scanner sc=new Scanner(System.in);
                System.out.println("Enter UN and PWD");
                un=sc.nextInt();
                pwd=sc.nextInt();
                int result=un/pwd;
            System.out.println("Validated.........take money.");

            System.out.println("Connection to be terminated");

    }
}
