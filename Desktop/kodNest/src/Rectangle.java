import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        double length=sc.nextDouble();
        double width=sc.nextDouble();
        System.out.printf("%.2f", RectangleArea(length,width));
    }
    public static double RectangleArea(double length , double width){
        return length *width;

    }
}
