public class MainThread {
    public static void main(String[] args) {
        Activity t1=new Activity();
        Activity t2=new Activity();
        Activity t3=new Activity();
        t1.setName("bank");
        t2.setName("additon");
        t3.setName("print");
        t1.start();
        t2.start();
        t3.start();
    }
}
