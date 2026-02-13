import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\satee\\Documents\\Employee.txt";
        FileInputStream ff=new FileInputStream(path);
        ObjectInputStream oos=new ObjectInputStream(ff);
        SerilazabileEmployee employee=(SerilazabileEmployee) oos.readObject();
        System.out.println(employee.id+" "+employee.name +" " + employee.salary);
    }
}
