import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end =sc.nextInt();
        for(int i=10; i<=20; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i %j==0){
                    count ++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }

    }
}

public class Classroom {
  static int totalAttendance = 0;
  
  int classroomAttendance = 0;
  
  public void markAttendance() {
    classroomAttendance++;
    totalAttendance++;
  }
  
  public void displayAttendance() {
    System.out.println("Attendance in this classroom: " 
      + classroomAttendance);
    System.out.println("Total attendance in school: " 
      + totalAttendance);
  }
  
  public static void main(String[] args) {
    Classroom class101 = new Classroom();
    Classroom class102 = new Classroom();
    
    class101.markAttendance();
    class101.markAttendance();
    
    class101.displayAttendance();
    
    class102.markAttendance();
    class102.markAttendance();
    class102.markAttendance();

    class102.displayAttendance();
  }
}
