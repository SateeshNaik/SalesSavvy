public class Bank {
    void inititate()  {
        System.out.println("Connction to bank server esablished");
        ATM atm = new ATM();
        atm.validate();

        System.out.println("Connection to bank server terminated..");
    }
}
