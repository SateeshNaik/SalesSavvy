import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Subjects {
    public static void main(String[] args)  throws IOException{
        Scanner sc=new Scanner(System.in);
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            String path = "C:\\Users\\satee\\Desktop\\studentPercentage.txtx.txt";
            String[] subject = {"Kannda", "English", "Hindi", "Math", "Scienec", "Social"};
            int totalSum = 0;
             fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < subject.length; i++) {
                int marks = sc.nextInt();
                bw.write(subject[i] + " = " + marks + " \n");
                totalSum += marks;
            }
            double percentage = totalSum / 6.0;
            bw.write("toatal : " + totalSum + " \n");
            bw.write("percentage : " + percentage);
        } finally {
            bw.close();
            fw.close();
            sc.close();
        }


    }
}
