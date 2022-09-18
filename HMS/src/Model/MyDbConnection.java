package Model;
import java.sql.*;
import javax.swing.JOptionPane;


public class MyDbConnection {
    private static Connection con ;
   
   public static Connection getConnection()
   {
      try{
      String path="jdbc:mysql://localhost:3306/project";
      con = DriverManager.getConnection(path,"root","12345");
      
      }
      catch(SQLException e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
      }
      return con;
   }
    
}