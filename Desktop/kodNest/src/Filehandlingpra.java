import java.io.*;

public class Filehandlingpra {
    public static void main(String[] args)  {


        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));



        String path="C:\\Users\\satee\\Desktop\\sateesh resume.pdf";
        File f=new File(path);
        System.out.println(f.exists());
        System.out.println("file name = " +f.getName());
        System.out.println(f.length());
        System.out.println(f.getAbsoluteFile());
        boolean yes = false;
        System.out.println(f.setReadable(yes));
        System.out.println(f.canExecute());
        System.out.println(f.getParent());
        System.out.println(f.getTotalSpace());
        System.out.println(f.getUsableSpace());
        System.out.println(f.isDirectory());


    }
}
