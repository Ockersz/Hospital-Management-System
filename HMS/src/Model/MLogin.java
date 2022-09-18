/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asiri
 */
public class MLogin {
    
    public int registerEmployee(String name,int age,String address,int tp,String gender,String username,String password)
    {
        int i = 0;
        try{
        Statement st = MyDbConnection.getConnection().createStatement();
        i = st.executeUpdate("INSERT INTO `employee`( `name`, `age`, `address`, `tp`,`gender`, `username`, `password`) VALUES ('"+name+"','"+age+"','"+address+"','"+tp+"','"+gender+"','"+username+"','"+password+"')");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }
    
    public boolean submitLoginDetails(String username, String password)
    {
        boolean i = false;
        try{
            Statement st = MyDbConnection.getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM `employee` WHERE username = '"+username+"' and password = '"+password+"' ");
            if(result.next())
            {
                i = true;
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Transit Failed \n\r" + e.getClass() + "\n\r" + e.getMessage(), "Login Details Management", JOptionPane.INFORMATION_MESSAGE);
        }
        return (i);  
    }
    
}
