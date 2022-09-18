
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MPatient {
     public int registerPatient(String name, int contact ,int age,String gender,String bgroup,String address,String disease)
    {
        int i = 0;
        try{
        Statement st = MyDbConnection.getConnection().createStatement();
        i = st.executeUpdate("INSERT INTO `patient`( `name`, `contact_no`, `age`, `gender`, `blood_group`, `address`, `deases`) VALUES ('"+name+"','"+contact+"','"+age+"','"+gender+"','"+bgroup+"','"+address+"','"+disease+"') ");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }
     public int updatePatient(String name, int contact ,int age,String gender,String bgroup,String address,String disease,int exsistContact){
         int i = 0;
        try{
        Statement st = MyDbConnection.getConnection().createStatement();
        i = st.executeUpdate("UPDATE `patient` SET `name`='"+name+"',`contact_no`='"+contact+"',`age`='"+age+"',`gender`='"+gender+"',`blood_group`='"+bgroup+"',`address`='"+address+"',`deases`='"+disease+"' WHERE `contact_no`='"+exsistContact+"' ");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
     }
    
     public ResultSet getPatientByContact(int contact)
     {
         ResultSet rs = null;
         try 
         {
             Statement st = MyDbConnection.getConnection().createStatement();
             rs = st.executeQuery("Select * from patient  where contact_no = '"+contact+"'");
             
         }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     
     return rs;
     }
   public ResultSet getFullHistoryofPatient(int contact)
   {
         ResultSet rs = null;
         try 
         {
             Statement st = MyDbConnection.getConnection().createStatement();
             rs = st.executeQuery("SELECT patient.*, report.ward_type,report.medicine,report.Symptoms,report.Diagnosis \n" +
"FROM `patient` INNER JOIN \n" +
"report\n" +
"ON patient.patient_id = report.patient_id\n" +
"WHERE patient.contact_no = '"+contact+"' ");
             
         }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     
     return rs;
     }
   
}
