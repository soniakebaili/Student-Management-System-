

import java.sql.*;

public class MyConnection 
{
  
    public static Connection getConnection() 
    {
       
        Connection con = null ; 
         try
         {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student_managment_db", "root", "");
       
        }
         catch (Exception ex)
       
         {
             System.out.println(ex.getMessage());
         }
    return con;
    }
}