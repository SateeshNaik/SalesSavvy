public class StudentA11 {
    public static void main(String[] args) {
        StudentA1 s=new StudentA1();
        s.setterId(101);
        s.setterMarks(34);
        s.setterName("ram");
        System.out.println(s.getterId());
        System.out.println(s.getterMarks());
        System.out.println(s.getterName());
    }
}
