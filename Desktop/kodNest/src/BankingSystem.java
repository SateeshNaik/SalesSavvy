import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String driverPath="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/bank";
        String user="root";
        String password="sateeshnaik";
        Connection con=null;
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;

        String sql1 = "UPDATE banking SET balance = balance - ? WHERE userId = ? AND userpassword = ?";
        String sql2 = "UPDATE banking SET balance = balance + ? WHERE userId = ?";

        try
        {
            Class.forName(driverPath);
            con= DriverManager.getConnection(url,user,password);
            ps1=con.prepareStatement(sql1);
            ps2=con.prepareStatement(sql2);

            System.out.println("Enter from userId and Password");
            int fuId=sc.nextInt();
            String  pwd=sc.next();

            System.out.println("Enter to userId");
            int tuid=sc.nextInt();

            System.out.println("Enter amount to be trans");
            int amount=sc.nextInt();
            ps1.setInt(1,amount);
            ps1.setInt(2,fuId);
            ps1.setString(3,pwd);

            ps2.setInt(1,amount);
            ps2.setInt(2,tuid);
            con.setAutoCommit(false);

            int res1 = ps1.executeUpdate();

            if (res1 == 0) {
                System.out.println("Invalid userId/password OR insufficient balance");
                con.rollback();
                return;
            }

            int res2 = ps2.executeUpdate();

            if (res2 == 0) {
                System.out.println("Receiver userId not found");
                con.rollback();
                return;
            }

            con.commit();
            System.out.println("Transaction successful: " + (res1 + res2) + " rows affected.");


        } catch (Exception e){
            try {
                con.rollback();
                e.printStackTrace();
            }catch (Exception e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                con.close();
                ps1.close();
                ps2.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
