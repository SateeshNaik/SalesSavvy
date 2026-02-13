public class KodnestMatriMoney {
    void initiate(){
        Applicant ap=new Applicant();
        try {
            ap.takeInput();
            ap.validate();
        }
        catch (Exception e){
            System.out.println("Issued Reached to KodnestMatriMoney........");
        }
    }
}
