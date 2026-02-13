public class Student extends Person {
    int marks;
    String college;
    public Student() {
        super("rahul", 29);
        System.out.println("Student zero parameterized constructor excuted");
        marks=35;
        college="UVCE";

    }
    public Student(int marks) {
        this();
        System.out.println("Student single parameter contructor exec");
        this.marks=marks;
        this.college="jntu";

    }
    public Student (int marks,String college) {
        this(95);
        System.out.println("Student 2 parameter constructor exec");
        this.marks=marks;
        this.college=college;
    }

}