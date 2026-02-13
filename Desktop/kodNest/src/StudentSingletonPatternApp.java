import java.io.*;

public class StudentSingletonPatternApp {
    public static void main(String[] args) throws IOException {
    StudentSingletonPattern ss=StudentSingletonPattern.getObject("modi","bjp",71,2);
        System.out.println(ss);
        String path="C:\\Users\\satee\\Documents\\SingleTerm.txt";
        FileOutputStream ff=new FileOutputStream(path);
       ObjectOutputStream oos=new ObjectOutputStream(ff);
       oos.writeObject(ss);


        StudentSingletonPattern s=StudentSingletonPattern.getObject("aa","bjp",71,2);
        System.out.println(s);
    }
}
