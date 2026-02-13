import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args){
        String str="Ravi Math 80 English 85 Scienece 90";
        String str2="Amith Math 80 English 85 Scienece 90";
        List<List<String>> names =new ArrayList<>();
        List<String> list=new ArrayList<>(Arrays.asList(str.split(" ")));
        names.add(list);
        System.out.println(names);
        System.out.println(names.get(0));

        names.get(0).set(2,"100");

        System.out.printf("%.2f",1.2345678);



    }
}
