package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) {
        String driverPath="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/fal";
        String user="root";
        String password="sateeshnaik";
        Connection con=null;
        Statement stmt=null;
        String  sql="select * from faculty";
         ResultSet rs=null;

        try{
            Class.forName(driverPath);
            System.out.println("Driver loaded");

             con= DriverManager.getConnection(url,user,password);
            System.out.println("Conncetion Established");

           stmt= con.createStatement();
            System.out.println("statement Created");

           rs =stmt.executeQuery(sql);
            System.out.println("Query Excuted and got the data");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }


        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {

                con.close();
                stmt.close();
                rs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
