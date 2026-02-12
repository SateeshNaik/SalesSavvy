import java.util.Scanner;

public class StringRotationManipulationRightOrLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String direction = sc.next();
        int len=str.length();
        String rotated="";
        if(direction.equalsIgnoreCase("left")) {
            rotated=str.substring(n) + str.substring(0,n);
        } else if(direction.equalsIgnoreCase("right")) {
            rotated = str.substring(len - n) + str.substring(0, len - n);
        } else {
            System.out.println("invalid");

        }
        System.out.println(rotated);


    }

}
