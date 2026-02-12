import java.util.HashSet;

public class EmployeeApp {
    public static void main(String[] args) {
        Employees e1=new Employees(12,"sandhya",9500);
        Employees e2=new Employees(13,"suresh",8500);
        Employees e3=new Employees(14,"ramesh",7500);
        Employees e4=new Employees(12,"sandhya",9500);
        Employees e5=new Employees(15,"surya",5500);
        HashSet<Employees> hs=new HashSet<>();
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);
        System.out.println(hs);
    }
}
