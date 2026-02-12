import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ClosetPairsOfPoints {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Point[] points=new Point[n];
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            points[i]=new Point(x,y);
        }
        for (Point p : points) {
            System.out.println(p.x +" "+p.y);
        }

    }

}
