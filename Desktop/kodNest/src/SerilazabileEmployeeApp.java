import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilazabileEmployeeApp {
    public static void main(String[] args) throws IOException {
        SerilazabileEmployee employee=new SerilazabileEmployee("aaa",1234,9000303);
        System.out.println(employee.name+" "+ employee.id +" "+employee.salary);
        String path="C:\\Users\\satee\\Documents\\Employee.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(employee);
    }
}
