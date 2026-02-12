public class BankApp {
    public static void main(String[] args) {
        System.out.println("MAIN CONNECTION ESTABLISHED");
        try {
            Bank bank = new Bank();
            bank.inititate();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("MAIN CONNCETION TERMINATED");
    }
}
