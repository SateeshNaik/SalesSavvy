import java.util.Scanner;

public   class Cricle extends Shape {
    float radius;
    float area;
    void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th radius = ");
        radius=sc.nextFloat();
    }

    @Override
    void calculateArea() {

    }

    void claculateArea() {
        area=3.141f * radius * radius;
    }

}
