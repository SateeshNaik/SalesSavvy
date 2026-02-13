import java.io.Serializable;

public class SerilazabileEmployee implements Serializable {
    String name;
  transient   int id;
    int salary;
    SerilazabileEmployee(String name,int id,int salary){
        super();
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }


}
