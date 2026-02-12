import java.util.Objects;

public class Employees {
    int id;
    String name;
    int salary;

    public Employees(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public  boolean equals(Object obj){
        if(this == obj){
            return false;
        } else if(obj==null){
            return false;
        } else if(getClass()!=obj.getClass()){
            return false;
        }
        Employees other=(Employees) obj;
        return id==other.id && name.equals(other.name) && salary==other.salary;
    }
    public int hashCode(){
        return Objects.hash(id,name,salary);
    }

    public String toString(){
        return "Employees [id=" + id+ ",name=" +name+", salary="+salary+"]";
    }

}
