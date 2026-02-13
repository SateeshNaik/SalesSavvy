import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingPdfs {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\satee\\Desktop\\sateesh resume.pdf";
        String destination = "C:\\Users\\satee\\Desktop\\backupresume.pdf\\resumeBackip.pdf";
        FileInputStream input = new FileInputStream(source);
        FileOutputStream output = new FileOutputStream(destination);
       try {

               byte[] buffer=new byte[1024];
                int bufferdata;
                while ((bufferdata=input.read(buffer))!=-1){
                    output.write(buffer,0,bufferdata);

                }
           System.out.println("PDF copied successfully!");
       } catch (IOException e){
           e.printStackTrace();
       }

    }
}
