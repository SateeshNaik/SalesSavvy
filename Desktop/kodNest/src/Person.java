import java.util.Objects;
import java.util.PriorityQueue;

public class Person {
    private  String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
    if(o == null  || getClass() !=o.getClass())
        return false;
      Person person=(Person) o;
      return age==person.age && name.equals(person.name);

    }
    public int hashCode(){
        return Objects.hash(name,age);
    }
    public String toString() {
        return name + " (" + age + ")";
    }
}
