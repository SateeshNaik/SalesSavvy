public class Demo {
    public static void main(String[] args) {
        System.out.println("connection to server");
        try {
            int a = 10;
            int b = 2;
            int d = a / b;
            System.out.println("Answer is = "+ d);
        } catch (Exception e){
            System.out.println("some issued occur");
        }
        System.out.println("conncetion terminated");
    }

}
