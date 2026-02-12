import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SaveUserInput {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            String path="C:\\\\Users\\\\satee\\\\Documents\\\\saveUserInput.txt";
            FileWriter ff=new FileWriter(path);
            BufferedWriter writer=new BufferedWriter(ff);
                  System.out.println("Type something");
            String input;
            while (!(input=sc.nextLine()).equalsIgnoreCase("exit")){
                writer.write(input);
                writer.newLine();
            }
            writer.close();
            sc.close();
            System.out.println("input is saved");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
