import java.util.Scanner;

public class ArraysToString{

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the digit:");
            int arraySize=Integer.parseInt(sc.nextLine());

            String[] str=new String[arraySize];
            String[] inputString=sc.nextLine().split(" ");



            for(int i=0; i<str.length; i++) {
                str[i]=inputString[i];
            }
            String[] positions=sc.nextLine().split(" ");

            int x=Integer.parseInt(positions[0]);

            int y=Integer.parseInt(positions[1]);
            System.out.println(str.length);

            System.out.println(str[x].length());
            System.out.println(str[y].length());


        }

    }


