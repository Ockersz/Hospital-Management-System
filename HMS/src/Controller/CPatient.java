/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MPatient;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.ResultSet;

/**
 *
 * @author Asiri
 */
public class CPatient {
    
    public static int registerPatient(String name, int contact ,int age,String gender,String bgroup,String address,String disease)
    {
        int i = 0;
        MPatient patient = new MPatient();
       i = patient.registerPatient(name, contact, age, gender, bgroup, address, disease);
       return i ;
    }
    public static int updatePatient(String name, int contact ,int age,String gender,String bgroup,String address,String disease,int exsistContact)
    {
          int i = 0;
        MPatient patient=new MPatient();
      i =  patient.updatePatient(name, contact, age, gender, bgroup,address,disease,exsistContact);
       return i ;
    }   
    public static ResultSet getPatientByContact(int contact){
        MPatient patient = new MPatient();
        ResultSet rs = patient.getPatientByContact(contact);
        return rs;
                }
    
    public static ResultSet getFullHistoryofPatient(int contact)
    {
        MPatient patient = new MPatient();
        ResultSet rs = patient.getFullHistoryofPatient(contact);
        return rs;
    }
}
