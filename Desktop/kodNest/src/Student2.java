public class Student2 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.setStudentId(456);
        s1.setFee((1000d));
        s1.setName("raju");

        System.out.println( s1.getStudentId());
        System.out.println(s1.getFee());
        System.out.println(s1.getName());

    }
}
