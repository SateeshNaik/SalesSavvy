import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcAdavanced {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String driverPath="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/fal";
        String user="root";
        String password="sateeshnaik";
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String SQL="select * from faculty where f_id = ? and d_id = ?";

        try {
           Class.forName(driverPath);
           con= DriverManager.getConnection(url,user,password);
           ps=con.prepareStatement(SQL);
            System.out.println("Enter  f_id  and d_id = ");
            int f_id= sc.nextInt();;
            int d_id=sc.nextInt();
            ps.setInt(1,f_id);
            ps.setInt(2,d_id);
            rs=ps.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));

            } else {
                System.out.println("Invalid Credentials! No faculty found.");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(con!=null) con.close();
                if(ps!=null) ps.close();
                if(rs!=null)rs.close();
                if(sc!=null) sc.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
