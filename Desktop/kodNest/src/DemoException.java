import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("Connection to be server estabilitty:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=a/b;
            System.out.println("quotient is " + d);
            System.out.println("Enter array size:");
            int size=0;
            int arr[]=null;
            size=sc.nextInt();
            arr=new int[size];
            System.out.println("Enter element to insert into array");
            int index=0;
            int ele=sc.nextInt();
            System.out.println("Enter the position to insert the element");
            index=sc.nextInt();
            arr[index]=ele;
            System.out.println("Element at index is " + arr[index]);

        } catch (ArithmeticException e){
            System.out.println("ArithmeticException at line 11:");
        }catch (NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException 17:");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 23:");
        }
        catch (Exception e){
            System.out.println("We are sorry...........");
        }
        System.out.println("Connection to server terminated");

    }
}
