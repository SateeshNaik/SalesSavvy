import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcInsertIntoDataIntoTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String driverPath="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/cor?user=root&password=sateeshnaik";
        String SQL="insert into course values(?,?,?)";
        Connection con=null;
        PreparedStatement ps=null;

        try {
            Class.forName(driverPath);
             con = DriverManager.getConnection(url);
             ps=con.prepareStatement(SQL);
            System.out.println("Enter c_id,c_title,c_credit");
            int id=sc.nextInt();
            String title=sc.next();
            int credits=sc.nextInt();
            ps.setInt(1,id);
            ps.setString(2,title);
            ps.setInt(3,credits);
            int result =ps.executeUpdate();
            System.out.println(result +" rows effected");


        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(con!=null) con.close();
                if(ps!=null) ps.close();
                if(sc!=null) sc.close();

            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
