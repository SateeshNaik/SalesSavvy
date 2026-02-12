public class Employee{
    private int empId;
    private String empName; // current class varilables
    private double empSal;

    public Employee(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;// parameterized constructor
        this.empSal = empSal;
    }


    public void getEmployeeDetails() {
        System.out.println("empid " + empId);
        System.out.println(empName);
        System.out.println(empSal);

    }
}
