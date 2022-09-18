
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MDiagnosisinfo {
    
    public int insertReport(int patient_id, String ward_type,String medicine,String symptoms,String diagnosis)
    {
        int i=0;
         try{
        Statement st = MyDbConnection.getConnection().createStatement();
        i = st.executeUpdate("INSERT INTO `report`( `patient_id`, `ward_type`, `Medicine`, `Symptoms`, `Diagnosis`) VALUES ('"+patient_id+"','"+ward_type+"','"+medicine+"','"+symptoms+"','"+diagnosis+"')");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return i;
    }
}
