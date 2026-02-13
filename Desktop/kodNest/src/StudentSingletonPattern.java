import java.io.Serializable;

public class StudentSingletonPattern implements Serializable {
    private  static  StudentSingletonPattern studentSingle=null;
    String name;
    String party;
    int age;
    int term;
     private StudentSingletonPattern(String name,String party,int age,int term){
        this.name=name;
        this.party=party;
        this.age=age;
        this.term=term;
    }
    public static StudentSingletonPattern  getObject(String name, String party, int age, int term){
         if(studentSingle==null) {
             studentSingle = new StudentSingletonPattern(name, party, age, term);
         }
         return studentSingle;

    }
}
