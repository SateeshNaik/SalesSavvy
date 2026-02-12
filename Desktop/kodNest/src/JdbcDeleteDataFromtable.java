import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDeleteDataFromtable {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                String driverPath="com.mysql.cj.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/cor?user=root&password=sateeshnaik";
                String SQL="delete from course where c_id= ?";
                Connection con=null;
                PreparedStatement ps=null;

                try {
                    Class.forName(driverPath);
                    con = DriverManager.getConnection(url);
                    ps=con.prepareStatement(SQL);
                    System.out.println("Enter c_id, to delete");
                    int id=sc.nextInt();
                    ps.setInt(1,id);

                    int result =ps.executeUpdate();
                    if (result > 0) {
                        System.out.println("course id deleted successfully.");
                    } else {
                        System.out.println("No course id found with given c_id.");
                    }

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

