import java.util.Scanner;

public class Activity extends  Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        if(name.equals("bank")){
            banking();
        } else if (name.equals("addition")) {
            addition();
        } else {
            printing();
        }

    }
    public void banking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        int originalPassword = 1234;
        try {

        int password = sc.nextInt();
            if(originalPassword==password) {
                System.out.println("take money from faziya furious");
            }
    }catch (Exception e){
            System.out.println("Wrong password Entered");
        }

    }
    public void addition(){

    }
    public void printing(){

    }
}
