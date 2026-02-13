public class StudentTree {
    String name;
    int marks;

     StudentTree(String name, int marks){
        this.name=name;
        this.marks=marks;
    }


    public String toString() {
        return name + " - " + marks;
    }

}
