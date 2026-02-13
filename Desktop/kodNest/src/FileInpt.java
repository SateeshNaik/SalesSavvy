
import java.io.*;


public class FileInpt {
    public static void main(String[] args) {
            String source = "C:\\Users\\satee\\Documents\\input.txt";
            String destination = "C:\\Users\\satee\\Documents\\outputText.txt";

            try {
                    FileReader ff=new FileReader(source);
                    FileWriter fw=new FileWriter(destination);
                    BufferedReader br = new BufferedReader(ff);
                    BufferedWriter bw = new BufferedWriter(fw);
                String data;
                while ((data = br.readLine()) != null) {
                    bw.write(data);
                    bw.newLine();
                }
                System.out.println("data is successfylly copied");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}


