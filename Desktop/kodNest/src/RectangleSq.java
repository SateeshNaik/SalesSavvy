import java.util.Scanner;

   class RectangleSq extends Shape {
    float length;
    float breadth;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th length = ");
        length=sc.nextFloat();
        System.out.println("Enter th breadth = ");
        breadth=sc.nextFloat();
    }

       @Override
       void calculateArea() {

       }

       void claculateArea() {
        area = length * breadth;

    }
}
